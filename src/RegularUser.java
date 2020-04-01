import java.util.HashMap;

public class RegularUser extends User {
	private int points;
	private HashMap<String, Ticket> purchaseHistory = new HashMap<>();
	public RegularUser(String name, String dateOfBirth, String email, String userName, String password, int age) {
		super(name,dateOfBirth,email,userName,password,age);
		points = 0;
	}
	
	/**@Overrides user purchase ticket
	 * Xavier
	 * Purchases the ticket currently in the user ticket space, applies points, uploads the ticket to user ticket history for refund use,
	 * sets current ticket to null
	 */
	public void purchaseTicket() {
		//null check
		if(this.ticket == null) {
			System.out.println("There is nothing in your ticket, please find a show you would like to watch to begin purchasing tickets.");
		}

	}
	
	public void spendPoints() {
		//TODO enable points to be used to cheapen ticket
	}
}

