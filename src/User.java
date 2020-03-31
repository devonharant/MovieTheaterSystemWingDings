
import java.util.Scanner;
public abstract class User {
		private String  name;
		private String dateOfBirth;
		private String email;
		private String userName;
		private String password;
		private int age;
		private Ticket ticket;

		public User() {
			this.name = "user";
			this.dateOfBirth = "09/09/1999";
			this.email = "no email yet";
			this.userName = "stupid";
			this.password = "not supid";
			this.age = 12;
			this.ticket = null;
		}
		public User(String name, String dateOfBirth, String email, String userName, String password, int age) {
			this.setName(name);
			this.setDateOfBirth(dateOfBirth);
			this.setEmail(email);
			this.setUserName(userName);
			this.setPassword(password);
			this.setAge(age);
			this.ticket = null;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			if(age <0) {
				System.out.println("invalid age");
			}
			else {
				this.age = age;
			}
		}


		/**
		 * creates a ticket based on the show
		 * @param show
		 */
		public void createTicket(Show show) {
			Scanner keyboard = new Scanner(System.in);
			double price;
			System.out.println("how many tickets for:\n" + show.toStringShort());
			int numOfTickets = keyboard.nextInt();
			keyboard.nextLine();
			System.out.println("what seats would you like to reserve?\n");
			show.printSeats();
			System.out.println("Enter seats in AA AB AC format");
			boolean q = false;
			String[] seats = null;
			while(!q) {
				String seatString = keyboard.nextLine();
				seats = seatString.split(" ");
				q = true;
				// checks if the string is formatted correctly else returns user to enter the seats correctly
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
				if(formatted&&!show.reserveSeats(seats)) {
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
			}
			else
				food = null;
			Ticket t = new Ticket(show,seats,food,price);
			this.ticket = t;
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
			// Not sure exactly how to do this? chris
			if(this.ticket == true) {
				//if(user == true) for logged in, 5 points per dollar, multiply cost x 5 and show on ticket
				printTicket();

			}

		}

		/**
		 * Xavier
		 * calls the toString of the ticket saved to the user
		 *
		 */
		public void printTicket() {
			System.out.println(this.ticket.toString());
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
			this.ticket.show.cancelSeatReservation(ticket.seats);
			this.ticket = null;
		}



		public String toString () {
			return name + dateOfBirth + email + userName + password + age;
		}
}
