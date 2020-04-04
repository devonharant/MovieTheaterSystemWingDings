
/**
 * This class sets up the base for all show reviews
 * @author Wingdings
 */
public class Review {

	protected int stars;
	protected String review;

	protected RegularUser reviewer;
	
	public Review(int stars, String review, RegularUser user) {
		this.setStars(stars);
		this.setReview(review);
		this.reviewer = user;
	}
	
	/**
	 * gets the star ratings for each show
	 * @return
	 */
	public int getStars() {
		return stars;
	}
	
	/**
	 * gets the reviews for each show
	 * @return
	 */

	public String getReview() {

		return null;
	}
	
	/**
	 * 
	 */
	public void setReview(String review) {
		this.review = review;
	}
	
	/**
	 * sets the star ratings for each show
	 * @return
	 */
	public void setStars(int stars) {
		//TODO
		//sanitize to 1-5 stars
		this.stars = stars;
	}
	
	/**
	 * sorts reviews
	 */
	public void sortReview() {

	}
	
	
	
	public String toString() {
		return "Stars: " + stars + "\nReviewer: " + reviewer.getUserName() +"\nReview: " + review; 
	}
}
