/**
 * 
 * @author WingDings
 */
public class Show {

	private String name;
	private String description;
	private String time;
	private boolean[][] seats;
	private Review review;
	
	public Show(String name, String description, String time, Review review, int theaterRows, int theaterColumns) {
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
	 * todo sanitize setters.
	 */
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
		//sanitize to real time
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
