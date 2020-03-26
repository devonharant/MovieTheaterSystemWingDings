
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
		//todo set all seats to true
		
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
		this.time = time;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}
	
	
}
