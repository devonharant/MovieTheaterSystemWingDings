import java.util.HashMap;

public class RegularUser extends User {
	protected int points;
	protected HashMap<String, Ticket> purchaseHistory = new HashMap<>();
	protected HashMap<String, Review> reviewHistory = new HashMap<>();
	protected String name;
	protected String dateOfBirth;
	protected String email;
	protected String userName;
	protected String password;
	protected int age;
	
	public RegularUser() {
		this.name = "annon";
		this.dateOfBirth = "09/09/1999";
		this.email = "no email yet";
		this.userName = "Guest";
		this.password = "null";
		this.age = 12;
		this.points = 0;
	}
	
	public RegularUser(String name, String dateOfBirth, String email, String userName, String password, int age) {
		super();
		this.setName(name);
		this.setDateOfBirth(dateOfBirth);
		this.setEmail(email);
		this.setUserName(userName);
		this.setPassword(password);
		this.setAge(age);
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
	
	public String toString () {
		return "Name: " +name + "\nDate of Birth: " + dateOfBirth + "\nEmail: " +email + "\nUsername: " + userName + "\nPassword: " + 
	password + "\nAge: " +age;
	}
}

