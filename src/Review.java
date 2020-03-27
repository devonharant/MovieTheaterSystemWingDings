
/**
 * This class sets up the base for all show reviews
 * @author Wingdings
 */
public class Review {

	protected int stars;
	protected String review;
	
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
	public String getReviews() {
		return null;
	}
	
	/**
	 * sets the star ratings for each show
	 * @return
	 */
	public int setStars() {
		return stars;
	}
	
	/**
	 * sorts reviews
	 */
	public void sortReview() {

	}
	/**
	 * writes the reviews for a listing
	 * @return
	 */
	public String writeReview() {
		return null;
	}
	/**
	 * deletes a listing
	 */
	public void deleteReview() {

	}
	/**
	 * edits a listing
	 * @return
	 */
	public String editReview() {
		return null;
	}
	
	public String toString() {
		return "Stars: " + stars + "\nReview: " + review; 
	}
}
