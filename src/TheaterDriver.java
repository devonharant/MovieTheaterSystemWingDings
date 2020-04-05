import java.util.*;

public class TheaterDriver {
	
	private static User user;
	private static Scanner key = new Scanner(System.in);
	private static String response;
	private static int numberResponse;
	private static Map<String, Show> shows = new HashMap<>();
	private static Map<String, Venue> venue = new HashMap<>();
	private static Map<String, RegularUser> users = new HashMap<>();
	
	//hardcode test variables
	private static RegularUser testUser = new RegularUser();
	
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
		while((numberResponse < 0 || numberResponse > 3)) {
			System.out.println("Invalid input, try again");
			numberResponse = key.nextInt();
		}
		
		switch(numberResponse) {
		case 1:
			userSignIn();
			break;
		case 2:
			guestPage();
			break;
		case 3:
			adminSignIn();
			break;
		default:
			System.out.println("Invalid choice, try again");
			break;
		}
	}
	
	/**
	 * contains the user splash page with choices for printing show types for purchasing purposes or leaving a review
	 */
	private static void userSignIn() {
		String username;
		String password;
		System.out.println("Registered User");
		System.out.println("Please sign in (enter anything for now)\n" +
						   "Username: ");
		username = key.next();
		System.out.println("Password: ");
		password = key.next();
		if(true /*loginCheck(username, password)*/) {
			userLandingPage();	
		}
	}
	private static void userLandingPage() {
		RegularUser user = new RegularUser();
		System.out.println("What kind of shows would you like to see?\n" + 
				   "Movies (1)\n" +
				   "Plays (2)\n" +
				   "Concerts (3)\n"+
				   "or would you like to leave a review for a show or venue (4)");
		numberResponse = key.nextInt();
		key.nextLine();
		while(numberResponse < 0 || numberResponse > 4) {
			System.out.println("Invalid input, try again");
			numberResponse = key.nextInt();
			key.nextLine();
		}
		if(numberResponse == 4) {
			reviewCheck(user);
		}
		else {
			showCheck(numberResponse, user);
		}
	}
	
	/**
	 * contains logic for just printing show types and purchasing ticket, base user purchase will prompt the guest to create a profile
	 */
	private static void guestPage() {
		user = new User();
		System.out.println("Welcome Guest!");
		System.out.println("What kind of shows would you like to see?\n" + 
						   "Movies (1)\n" +
						   "Plays (2)\n" +
						   "Concerts (3)\n");
		numberResponse = key.nextInt();
		key.nextLine();
		while(numberResponse < 0 || numberResponse > 3) {
			System.out.println("Invalid input, try again");
			numberResponse = key.nextInt();
		}
		
		showCheck(numberResponse, user);
	}
	
	/**
	 * contains the logic for the admin page, will eventually need to extend to regular user unless we wish to do further splits
	 */
	private static void adminSignIn() {
		String username;
		String password;
		System.out.println("Admin");
		System.out.println("Please sign in (enter anything for now)\n" +
						   "Username: ");
		username = key.next();
		System.out.println("Password: ");
		password = key.next();
		if(true /*loginCheck(username, password)*/) {
			adminLandingPage();
		}
	}
	
	private static void adminLandingPage() {
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
	}
	
	/*private static boolean loginCheck(String username, String password) {
		String userCheck;
		String passCheck;
		if(username.equalsIgnoreCase(userCheck) && password.equalsIgnoreCase(passCheck)) {
			return true;
		}
		return false;
	}*/
	
	
	/**
	 * contains logic for printing out the show hashmaps contents and allowing users to create and purchase a ticket from that information
	 * @param choice (the number relating to movie(1), play(2) or concert(3)
	 * @param user the user profile making this choice, passed through for ticket generation reasons
	 */
	private static void showCheck(int choice, User user) {
		switch(choice) {
		case 1:
			System.out.println("Here are the available movies!\nSelect a movie to see the venues and showtimes!");
			venue1.shows.printShows();
			String show = key.nextLine();
			Show tempShow = shows.get(show);
			user.createTicket(tempShow);
			user.purchaseTicket();
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
	
	/**
	 * contains logic for users to leave reviews for venue or show
	 * @param user the user object being used to create a review
	 */
	private static void reviewCheck(RegularUser user) {
		System.out.println("");
	}
	
	/**
	 * contains the logic for admin functions
	 * @param choice, int representing what the admin would like to do add a show(1) remove a show(2) add food (3) remove food (4)
	 * @param user, the admin making the changes
	 */
	private static void adminFunctions(int choice, Admin user) {
		switch(choice) {
		case 1:
			System.out.print("Created show:\n" + user.addShowListing().toStringShort());
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
			System.out.println("????");
			break;
		}
	}
}
