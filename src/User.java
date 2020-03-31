
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
		}
		public User(String name, String dateOfBirth, String email, String userName, String password, int age) {
			this.name = name;
			this.dateOfBirth = dateOfBirth;
			this.email = email;
			this.userName = userName;
			this.password = password;
			this.age = age;
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
			
		}

		public void purchaseTicket(Ticket ticket) {
	
		}
		/**
		 * calls the toString of the ticket
		 * @param ticket
		 */
		public void printTicket(Ticket ticket) {
			ticket.toString();
		}
		
		
		public void generateETicket(Ticket ticket) {
	
		}
		
		public void CancelTicket(Ticket ticket) {
			
		}



		public String toString () {
			return name + dateOfBirth + email + userName + password + age;
		}
}
