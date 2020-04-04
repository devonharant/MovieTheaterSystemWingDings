import java.util.*;

public class TheaterDriver {
	
	private static User user;
	private static Scanner key = new Scanner(System.in);
	private static String response;
	private static int numberResponse;
	private static HashMap<String, Show> shows;
	private static RegularUser testUser = new RegularUser();
	
	//hardcode test variables
	private static HashMap<String, Venue> venue;
	private static Venue venue1 = new Cineplex("Nickelodeon", "Main Street");
	private static Venue venue2 = new ConcertHall("Koger", "Assembly Street");
	private static Venue venue3 = new PlayHouse("PlaysRUs", "Somewhere Street");
	private static String[] times1 = {"12/12 12:00PM", "12/12 03:00PM", "12/12 06:00PM"};
	private static String[] times2 = {"12/13 05:00PM", "12/14 05:00PM"};
	private static Review testReview = new Review(5, "Test", testUser);
	private static Admin admin = new Admin("devon", "11/16/1998", "devharant@gmail.com", "garth", "nuts", 21, venue3);
	
	
	public static void main(String[] args) {
		venue.put("Nickelodeon", venue1);
		venue.put("Koger", venue2);
		venue.put("PlaysRUs", venue3);
		Show show1 = new Show(venue1, "Frozen 2", "Anna, Elsa, Kristoff, Olaf and Sven leave Arendelle to travel to an ancient, autumn-bound forest of an enchanted land. They set out to find the origin of Elsa's powers in order to save their kingdom.", times1 , testReview, 10, 20, 12.99);
		Show show2 = new Show(venue2, "Dead and Company", "Sit back and relax to the tunes of the Dead with Bob Weir and John Mayer", times2, testReview, 10, 10, 60.00);
		venue1.shows.addShow(show1);
		venue2.shows.addShow(show2);
		shows.put("Frozen 2", show1);
		shows.put("Dead and Company", show2);
		run();
	}
	
	private static void run() {
		
		System.out.println("***WELCOME TO PORTIA'S PICS & FLICKS***\n\n" +
						   "Are you a registered user with us? Sign in! (1)\n\n" +
						   "Do you wish to continue as a guest? (2)\n\n" +
						   "Admin login (3)\n");
		numberResponse = key.nextInt();
		while(numberResponse < 0 || numberResponse > 3) {
			System.out.println("Invalid input, try again");
			numberResponse = key.nextInt();
		}
		
		switch(numberResponse) {
		case 1:
			userPage();
			break;
		case 2:
			guestPage();
			break;
		case 3:
			adminPage();
			break;
		default:
			System.out.println("Invalid choice, try again");
			break;
		}
	}
	
	private static void userPage() {
		String username;
		String password;
		System.out.println("Registered User");
		System.out.println("Please sign in (enter anything for now)\n" +
						   "Username: ");
		username = key.next();
		System.out.println("Password: ");
		password = key.next();
		if(true /*loginCheck(username, password)*/) {
			user = new RegularUser();
			System.out.println("What kind of shows would you like to see?\n" + 
					   "Movies (1)\n" +
					   "Plays (2)\n" +
					   "Concerts (3)\n");
			
			numberResponse = key.nextInt();
			while(numberResponse < 0 || numberResponse > 3) {
				System.out.println("Invalid input, try again");
				numberResponse = key.nextInt();
			}
			
			showCheck(numberResponse, user);
		}
	}
	
	private static void guestPage() {
		user = new User();
		System.out.println("Welcome Guest!");
		System.out.println("What kind of shows would you like to see?\n" + 
						   "Movies (1)\n" +
						   "Plays (2)\n" +
						   "Concerts (3)\n");
		numberResponse = key.nextInt();
		while(numberResponse < 0 || numberResponse > 3) {
			System.out.println("Invalid input, try again");
			numberResponse = key.nextInt();
		}
		
		showCheck(numberResponse, user);
	}
	
	private static void adminPage() {
		String username;
		String password;
		System.out.println("Admin");
		System.out.println("Please sign in (enter anything for now)\n" +
						   "Username: ");
		username = key.next();
		System.out.println("Password: ");
		password = key.next();
		if(true /*loginCheck(username, password)*/) {
			Venue venue = new Cineplex("george", "george"); //test stuff
			Admin user = admin;
			System.out.println("Welcome " + user.getName() + "!\n");
			System.out.println("What would you like to do?\n" + 
							   "Add show (1)\n" + 
							   "Remove show (2)\n" +
							   "Add food (3) \n" + 
							   "Remove food (4)\n");
			numberResponse = key.nextInt();
			while(numberResponse < 0 || numberResponse > 4) {
				System.out.println("Invalid input, try again");
				numberResponse = key.nextInt();
			}
			
			adminFunctions(numberResponse, user);
		}
	}
	
	/*private static boolean loginCheck(String username, String password) {
		String userCheck;
		String passCheck;
		if(username.equalsIgnoreCase(userCheck) && password.equalsIgnoreCase(passCheck)) {
			return true;
		}
		return false;
	}*/
	
	private static void showCheck(int choice, User user) {
		switch(choice) {
		case 1:
			System.out.println("Here are the available movies!\nSelect a movie to see the venues and showtimes!");
			venue1.shows.printShows();
			String show = key.next();
			Show tempShow = shows.get(show);
			user.createTicket(tempShow);
			break;
		case 2:
			System.out.println("Here are the available plays!\nSelect a play to see the venues and showtimes!");
			break;
		case 3:
			System.out.println("Here are the available concerts!\nSelect a concert to see the venues and showtimes!");
			break;
		default:
			System.out.println("How did you get here?");
			break;
		}
	}
	
	private static void adminFunctions(int choice, Admin user) {
		switch(choice) {
		case 1:
			user.addShowListing();
			break;
		case 2:
			System.out.println("Removing show");
			break;
		case 3:
			System.out.println("Adding food");
			break;
		case 4:
			System.out.println("Removing food");
			break;
		default:
			System.out.println("Go away, how did you find me?");
			break;
		}
	}
}
