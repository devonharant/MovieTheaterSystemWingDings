
import java.util.Scanner;

public class Admin extends RegularUser {
	private Venue venue;
	
	public Admin(Integer id, String name, String dateOfBirth, String email, String userName, String password, int age, Venue venue) {
		super(id, name,dateOfBirth,email,userName,password,age);
		this.venue = venue;
	}
	
	/**
	 * adds a show to the show iterator of a venue after querying the user for the information, takes in
	 * multiple showtimes to create a list of the same show at different times.
	 */
	public Show addShowListing() {
		//user input data.
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Whats the show name");
		String name = keyboard.nextLine();
		System.out.println("Whats the show description");
		String description = keyboard.nextLine();
		System.out.println("Whats the show price");
		double price = keyboard.nextDouble();
		
		//TODO fix this logic
		System.out.println("how many show times are there for this show?");
		int numOfTimes = keyboard.nextInt();
		keyboard.nextLine();
		String times[] = new String[numOfTimes];

		System.out.println("What are the show times in format mm/dd 00:00am, enter them one at time");
		int count = 0;
		while (count < numOfTimes) {

			String time = keyboard.nextLine();
			if(time.length() != 13) {
				System.out.println("Make sure the time is correctly formated as mm/dd 00:00am");
			}
			else {
				//TODO
				//call is valid date function here
				//adds new string to the times array
				times[count] = time.toUpperCase();
				count++;
			}
		}
		//TODO review logic to go here
		//search sql for same show and copy review over else review is set to empty
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
		Show newShow = venue.factory.createShow(this.venue, name, description, times, review, theaterRows, theaterColumns, price);
		venue.shows.addShow(newShow);
		return newShow;
	}
	
	/**
	 * 
	 * @param show
	 */
	public void removeShow(String show) {
		//TODO
	}
	
	/**
	 * 
	 *
	 */
	public void addFood() {
		//TODO
	}
	/**
	 * 
	 * @param food
	 */
	public void removeFood(String food) {
	//TODO
	}
	
	public String getName() {
		return name;
	}
}

