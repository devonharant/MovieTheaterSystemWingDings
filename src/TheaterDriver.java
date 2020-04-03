import java.util.*;

public class TheaterDriver {
	
	private static User user;
	private static Scanner key = new Scanner(System.in);
	private static String response;
	private static int numberResponse;
	
	public static void main(String[] args) {
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
		System.out.println("Please sign in\n" +
						   "Username: ");
		username = key.next();
		System.out.println("Password: ");
		password = key.next();
		if(true /*loginCheck(username, password)*/) {
			System.out.println("What kind of shows would you like to see?\n" + 
					   "Movies (1)\n" +
					   "Plays (2)\n" +
					   "Concerts (3)\n");
			
			numberResponse = key.nextInt();
			while(numberResponse < 0 || numberResponse > 3) {
				System.out.println("Invalid input, try again");
				numberResponse = key.nextInt();
			}
			
			showCheck(numberResponse);
		}
	}
	
	private static void guestPage() {
		System.out.println("Guest");
		System.out.println("What kind of shows would you like to see?\n" + 
						   "Movies (1)\n" +
						   "Plays (2)\n" +
						   "Concerts (3)\n");
		numberResponse = key.nextInt();
		while(numberResponse < 0 || numberResponse > 3) {
			System.out.println("Invalid input, try again");
			numberResponse = key.nextInt();
		}
		
		showCheck(numberResponse);
	}
	
	private static void adminPage() {
		String username;
		String password;
		System.out.println("Admin");
		System.out.println("Please sign in\n" +
						   "Username: ");
		username = key.next();
		System.out.println("Password: ");
		password = key.next();
		if(true /*loginCheck(username, password)*/) {
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
			
			adminFunctions(numberResponse);
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
	
	private static void showCheck(int choice) {
		switch(choice) {
		case 1:
			System.out.println("Here are the available movies!\nSelect a movie to see the venues and showtimes!");
			//print shows
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
	
	private static void adminFunctions(int choice) {
		switch(choice) {
		case 1:
			System.out.println("Adding show");
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
