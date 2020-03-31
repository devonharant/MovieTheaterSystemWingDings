/**
 * 
 * @author WingDings
 */
public class Show {

	private Venue venue;
	private String name;
	private String description;
	private String time;
	private boolean[][] seats;
	private int rows;
	private int cols;
	private Review review;
	private double price;
	
	public Show(Venue venue, String name, String description, String time, Review review, int theaterRows, int theaterColumns, double price) {
		this.setVenue(venue);
		this.setName(name);
		this.setDescription(description);
		this.setTime(time);
		this.setRows(theaterRows);
		this.setCol(theaterColumns);
		this.seats = new boolean[rows][cols];
		for(int i = 0; i < theaterRows; i++) {
			for(int j = 0; j < theaterColumns; j++) {
				seats[i][j]= true;
			}
		}
		this.setReview(review);
	}
	/*
	 * getters and setters, no sanitization is done here
	 * 
	 * TODO sanitize setters.
	 */
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		if(rows>0)
			this.rows = rows;
		else
			System.out.print("you cant have less than a row in a theater");
	}

	public int getCol() {
		return cols;
	}

	public void setCol(int col) {
		if(col>0)
			this.cols = col;
		else
			System.out.println("you can have less than a seat in a row");
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	public Venue getVenue() {
		return venue;
	}
	
	public void setVenue(Venue venue) {
		this.venue = venue;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		//TODO sanitize to real time
		this.time = time;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}
	
	
	/**Xavier
	 * takes a string seat array and updates the shows seat array to reserve those seats
	 * @param reservation
	 */
	public boolean reserveSeats(String[] reservation) {
		for(String string:reservation) {
			//splits String of AA into r and c
			char charR = string.charAt(0);
			char charC = string.charAt(1);
			int r = ((int) charR)-41;
			int c = ((int) charC)-41;
			if(seats[r][c]==false) {
				return false;
			}
		}
		for(String string:reservation) {
			//splits String of AA into r and c
			char charR = string.charAt(0);
			char charC = string.charAt(1);
			int r = ((int) charR)-41;
			int c = ((int) charC)-41;
			seats[r][c]=false;
		}
		return true;
		
	}
	
	/**Xavier
	 * Takes in a seat reservation and frees up the shows seats at that area
	 * @param reservation
	 */
	public void cancelSeatReservation(String [] reservation) {
		for(String string:reservation) {
			//splits String of AA into r and c
			char charR = string.charAt(0);
			char charC = string.charAt(1);
			int r = ((int) charR)-41;
			int c = ((int) charC)-41;
			seats[r][c]=false;
		}
	}
	
	/**Xavier
	 * prints the available seats to the console using unicode character to denote column and row of the theater
	 */
	public void printSeats() {
		//preps the column to be a name space
		System.out.print(" ");
		//prints the row names
		for(int i = 0; i < rows; i++ ) {
			char c =  (char) (i+41);
			System.out.print(c+" ");
		}
		//prints the seats as (O)pen or (x)occupied, prints the row label first.
		System.out.println();
		for(int i = 0; i < rows; i++) {
			char c =  (char) (i+41);
			System.out.print(c);
			for (int j = 0; j < cols; j++) {
				if(seats[i][j]==true)
					System.out.print("O ");
				else
					System.out.print("X ");
			}
			System.out.println();
		}
		
	}
	
	
	
	public String toStringShort() {
		return "Name: " + name +  "\nTime: " + time;
	}
	
	public String toString() {
		return "Name: " + name + "\nDescription: " + description + "\nTime: " + time + "\nReview" + review;
	}
}
