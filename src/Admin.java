

import java.util.Scanner;
public class Admin extends User {
	private Venue venue;
	
	public Admin(String name, String dateOfBirth, String email, String userName, String password, int age, Venue venue) {
		super(name,dateOfBirth,email,userName,password,age);
		this.venue = venue;
	}
	
	/**
	 * 
	 */
	public void addShow() {
		//user input data.
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Whats the show name");
		String name = keyboard.nextLine();
		System.out.println("Whats the show description");
		String description = keyboard.nextLine();
		System.out.println("how many show times are there for this show?");
		int numOfTimes = keyboard.nextInt();
		keyboard.nextLine();
		String times[] = new String[numOfTimes];
		System.out.println("What are the show times in format mm/dd 00:00am type q when done");
		for(int i = 0; i < numOfTimes; i++) {
			String time = keyboard.nextLine();
			//TODO
			//needs better sanitization check
			if(time.length() != 13) {
				System.out.println("Make sure the time is correctly formated as mm/dd 00:00am");
			}
			else {
				//adds new string to the times array
				times[i] = time;
			}
		}
		//TODO review logic to go here
		Review review = null;
		
		/*
		 * TODO
		 *needs logic for non uniform theaters, dont want to do that cause i hates it. hssss  
		 */
		System.out.println("Whats the theater size, rows of seats and seats per row");
		int theaterRows = keyboard.nextInt();
		int theaterColumns = keyboard.nextInt();
		keyboard.nextLine();
		/*
		 * adds a new show to the show iterator for each entered time
		 */
		for(int i=0; i<times.length;i++) {
			Show newShow = venue.factory.createShow(this.venue, name, description, times[i], review, theaterRows, theaterColumns);
			venue.shows.addShow(newShow);
		}
		
	}
	
	/**
	 * 
	 * @param show
	 */
	public void removeShow(String show) {
		
	}
	
	/**
	 * 
	 * @param food
	 */
	public void addFood() {
		
	}
	/**
	 * 
	 * @param food
	 */
	public void removeFood(String food) {
		
	}
}

