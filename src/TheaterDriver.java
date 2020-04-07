import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import java.util.Map.Entry;

public class TheaterDriver {
	
	private static Guest user;
	private static Scanner key = new Scanner(System.in);
	private static String response;
	private static int numberResponse;
	private static Map<Integer, Show> shows = new HashMap<>();
	private static Map<Integer, Venue> venues = new HashMap<>();
	private static Map<Integer, User> users = new HashMap<>();
	private static boolean userQuit = false;
	/*
	//hardcode test variables
	private static User testUser = new User();
	
	private static Venue venue1 = new Cineplex("Nickelodeon", "Main Street");
	private static Venue venue2 = new ConcertHall("Koger", "Assembly Street");
	private static Venue venue3 = new PlayHouse("PlaysRUs", "Somewhere Street");
	private static String[] times1 = {"12/12 12:00PM", "12/12 03:00PM", "12/12 06:00PM"};
	private static String[] times2 = {"12/13 05:00PM", "12/14 05:00PM"};
	private static Review testReview = new Review(5, "Test", testUser);
	*/
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		SQLServerConnection server = new SQLServerConnection();
		SQLServerConnection.start();
		venues = SQLServerConnection.venueHash(); 
		shows = SQLServerConnection.showhash();
		users = SQLServerConnection.printuserhash();
		run();
	}
	
	private static void run() throws SQLException {
		
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
			System.out.println("Thank you for using PORTIA'S PICS & FLICKS!");
			break;
		case 2:
			guestPage();
			System.out.println("Thank you for using PORTIA'S PICS & FLICKS!");
			break;
		case 3:
			adminSignIn();
			System.out.println("Thank you for using PORTIA'S PICS & FLICKS!");
			break;
		default:
			System.out.println("Invalid choice, try again");
			break;
		}
	}
	
	/**
	 * contains the user splash page with choices for printing show types for purchasing purposes or leaving a review
	 * @throws SQLException 
	 */
	private static void userSignIn() throws SQLException {
		String username;
		String password;
		System.out.println("Registered User");
		System.out.println("Please sign in (enter anything for now)\n" +
						   "Username: ");
		username = key.next();
		key.nextLine();
		System.out.println("Password: ");
		password = key.next();
		key.nextLine();
		
		user = loginCheck(username, password);
		if(user != null) {
			while(userQuit == false) {
				userLandingPage();
			}
		}
	}
	private static void userLandingPage() {
		User user = new User();
		System.out.println("What kind of shows would you like to see?\n" + 
				   "Movies (1)\n" +
				   "Plays (2)\n" +
				   "Concerts (3)\n" +
				   "Or leave a review for a show or venue (4)\n" +
				   "Quit (5)");
		numberResponse = key.nextInt();
		key.nextLine();
		while(numberResponse < 0 || numberResponse > 5) {
			System.out.println("Invalid input, try again");
			numberResponse = key.nextInt();
			key.nextLine();
		}
		if(numberResponse == 5) {
			userQuit = true;
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
		user = new Guest();
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
		while(userQuit == false) {
			showCheck(numberResponse, user);
		}
	}
	
	/**
	 * contains the logic for the admin page, will eventually need to extend to regular user unless we wish to do further splits
	 * @throws SQLException 
	 */
	private static void adminSignIn() throws SQLException {
		Admin user;
		String username;
		String password;
		System.out.println("Admin");
		System.out.println("Please sign in (enter anything for now)\n" +
						   "Username: ");
		username = key.next();
		key.nextLine();
		System.out.println("Password: ");
		password = key.next();
		key.nextLine();
		user = (Admin) loginCheck(username, password);
		if(user != null) {
			while(userQuit == false) {
				adminLandingPage(user);
			}
		}
	}
	
	private static void adminLandingPage(Admin user) {
		//Admin user = admin;
		System.out.println("Welcome " + user.getName() + "!\n");
		System.out.println("What would you like to do?\n" + 
						   "Add show (1)\n" + 
						   "Remove show (2)\n" +
						   "Add food (3) \n" + 
						   "Remove food (4)\n" +
						   "Quit (5)");
		numberResponse = key.nextInt();
		while(numberResponse < 0 || numberResponse > 5) {
			System.out.println("Invalid input, try again");
			numberResponse = key.nextInt();
		}
	}
	
	private static User loginCheck(String username, String password) throws SQLException {
		if(SQLServerConnection.findUsername(username)==SQLServerConnection.findPassword(password)) {
			return users.get(SQLServerConnection.findUsername(username));
		}
		return null;
	}
	
	
	/**
	 * contains logic for printing out the show hashmaps contents and allowing users to create and purchase a ticket from that information
	 * @param choice (the number relating to movie(1), play(2) or concert(3)
	 * @param user the user profile making this choice, passed through for ticket generation reasons
	 */
	private static void showCheck(int choice, Guest user) {
		switch(choice) {
		case 1:
			System.out.println("Here are the available movies!\nSelect a movie to see the venues and showtimes!");
			for(Entry<Integer, Venue> v: venues.entrySet()) {
				if(v.getValue().getType()=="Cineplex");
				System.out.println(v.getValue().name);
				v.getValue().printShows();
			}
			String show = key.nextLine();
			Show tempShow = shows.get(show);
			user.createTicket(tempShow);
			user.purchaseTicket();
			break;
		case 2:
			System.out.println("Here are the available plays!\nSelect a play to see the venues and showtimes!");
			for(Entry<Integer, Venue> v: venues.entrySet()) {
				if(v.getValue().getType()=="PlayHouse");
				v.getValue().printShows();
			}
			break;
		case 3:
			System.out.println("Here are the available concerts!\nSelect a concert to see the venues and showtimes!");
			for(Entry<Integer, Venue> v: venues.entrySet()) {
				if(v.getValue().getType()=="ConcertHall");
				v.getValue().printShows();
			}
			break;
		case 5:
			userQuit = true;
			break;
		default:
			System.out.println("How are you here bro wtf");
			break;
		}
	}
	
	/**
	 * contains logic for users to leave reviews for venue or show
	 * @param user the user object being used to create a review
	 */
	private static void reviewCheck(User user) {
		System.out.println("What would you like to leave a review for? \nVenue (1) \nShow (2)");
		int reviewchoice = key.nextInt();
		switch(reviewchoice) {
		case 1:
			System.out.println("Which venue would you like to leave a review for?\n");
			System.out.println(Arrays.asList(venues)); 
			String venuechoice = key.nextLine();
			//Review testReview = new Review(5, "Test", testUser);
			System.out.println("Please enter the star rating for the venue (1-5)\n");
			int stars = key.nextInt();
			System.out.println("Please enter any comments for the venue\n");
			String review = key.nextLine();
			Review venueReview = new Review(stars, review, user);

			break;
		case 2:
			System.out.println("Which show would you like to leave a review for?\n");
			System.out.println(Arrays.asList(shows)); 
			String showchoice = key.nextLine();
			//Review testReview = new Review(5, "Test", testUser);
			System.out.println("Please enter the star rating for the show (1-5)\n");
			int showstars = key.nextInt();
			System.out.println("Please enter any comments for the show\n");
			String showreview = key.nextLine();
			Review showReview = new Review(showstars, showreview, user);
			break;
		default:
			System.out.println("Please enter a proper choice");
			break;
		}
		
	}
	
	/**
	 * contains the logic for admin functions
	 * @param choice, int representing what the admin would like to do add a show(1) remove a show(2) add food (3) remove food (4)
	 * @param user, the admin making the changes
	 * @throws SQLException 
	 */
	private static void adminFunctions(int choice, Admin user) throws SQLException {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("please choose a venue to work in");
		SQLServerConnection.printvenues();
		System.out.println("please enter the venue id that you want to work in");
		Integer vChoice = keyboard.nextInt();
		Venue venue = venues.get(vChoice);
		switch(choice) {
		case 1:
			System.out.print("Created show:\n" + user.addShowListing(venue).toStringShort());
			break;
		case 2:
			System.out.println("Removing show:\n" + user.removeShow(venue));
			break;
		case 3:
			System.out.println("Adding food\n" +user.addFood(venue).toString());
			break;
		case 4:
			System.out.println("Removing food\n" + user.removeFood(venue));
			break;
		case 5:
			userQuit = true;
			break;
		default:
			System.out.println("????");
			break;
		}
	}
}
