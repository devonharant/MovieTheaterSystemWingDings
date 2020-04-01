import java.io.*;
import java.util.Scanner;
public class User {
		
		protected Ticket ticket;

		public User() {
			
			this.ticket = null;
		}

		/**
		 * creates a ticket based on the show
		 * @param show
		 */
		public void createTicket(Show show) {
			Scanner keyboard = new Scanner(System.in);
			double price;

			System.out.println("what time would you like see?");
			show.showTimes();
			String time = keyboard.nextLine();
			/*
			 * TODO entered time check logic
			 */
			
			System.out.println("what seats would you like to reserve?");
			show.printSeats(time);

			System.out.println("Enter seats in AA AB AC format");
			boolean q = false;
			String[] seats = null;
			while(!q) {
				String seatString = keyboard.nextLine();
				seats = seatString.split(" ");
				q = true;
				//checks if the string is formatted correctly else returns user to enter the seats correctly
				boolean formatted = false;
				for(int i=0; i < seats.length; i++) {
					if(seats[i].length()!=2) {
					System.out.println("Make sure its in AA BB CC format with no space after the last seat");
					q = false;
					break;
					}
					if( i == seats.length - 1)
						formatted = true;
				}
				//if formatted correctly and the seats arent reseverd, reserves the seats, else returns user to reenter unreserved seats
				if(formatted&&!show.reserveSeats(time, seats)) {
					q = false;
					System.out.println("Some of those seats are already reserved, please enter a new batch of seats that are unreserved.");
				}
			}
			price = seats.length*show.getPrice();//price of ticket logic
			System.out.println("Would you like to pre buy popcorn or other food from this venue");
			String response = keyboard.nextLine();
			Food[] food = null;
			//TODO response logic
			if(response.contains("y")) {
				System.out.println("Foods available at " +show.getVenue().getName()+ " are:");
				show.getVenue().printFood();
				//TODO finish ability to add food to ticket
				Ticket t = new Ticket(show,time,seats,food,price);
				this.ticket = t;			}
			else {
				Ticket t = new Ticket(show,time,seats,price);
				this.ticket = t;
			}
		}

		/**
		 * Xavier
		 * Purchases the ticket currently in the user ticket space
		 */
		public void purchaseTicket() {
			//null check
			if(this.ticket == null) {
				System.out.println("There is nothing in your ticket, please find a show you would like to watch to begin purchasing tickets.");
			}
			
			/*
			 * TODO grab the driver function that creates a regular user and upgrade guest user to regular user
			 * 
			 * 
			 * SUPER IMPORTANT TODO
			 * 
			 */
		}

		/**
		 * Xavier
		 * calls the toString of the ticket saved to the user
		 *
		 */
		public void printTicket() {
			try {
				FileWriter writer = new FileWriter("Ticket.txt");
				writer.write("******" + ticket.getShow().getVenue().getName() + "******\n");
				writer.write("*     " + ticket.getShow().getName() + "     *\n");
				writer.write("*     " + ticket.getTime() + "     *\n");
				writer.write("*     " + ticket.seatsToString() + "     *\n");
				writer.write("*     " + ticket.getFood() + "     *\n");
				writer.write("*                *\n" );
				writer.write("*                *\n");
				writer.write("*     Total: " + ticket.getPrice() + "     *");
				writer.write("*                *\n");
				writer.write("*                *\n");
				writer.write("*   Thank you for your business!!   *");
				writer.write("*************************************");
				writer.close();
				System.out.println("Your ticket has been generated!");
			}catch(IOException e) {
				System.out.println("an error occurred");
				e.printStackTrace();
			}
		}


		public void generateETicket(Ticket ticket) {
			System.out.println(this.ticket.toString());
		}

		/**
		 * Xavier
		 * removes a generated ticket from the user and frees up the reserved seats
		 */
		public void CancelTicket() {
			//null check
			if(this.ticket == null) {
				System.out.println("There is nothing in your ticket.");
			}
			this.ticket.show.cancelSeatReservation(ticket.time, ticket.seats);
			this.ticket = null;
		}

}
