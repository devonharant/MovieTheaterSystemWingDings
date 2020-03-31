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
	private Review review;
	private double price;
	
	public Show(Venue venue, String name, String description, String time, Review review, int theaterRows, int theaterColumns, double price) {
		this.setVenue(venue);
		this.setName(name);
		this.setDescription(description);
		this.setTime(time);
		this.seats = new boolean[theaterRows][theaterColumns];
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
	
	public String toString() {
		return "Name: " + name + "\nDescription: " + description + "\nTime: " + time + "\nReview" + review;
	}
}
