
/**
 * Venue abstract class to be implemented by children
 * forcing characteristics and methods to be used
 * by the children
 * @author WingDings
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Venue{
	
  protected int venueid;
	protected String name;
	protected String location;
	protected String type;
	protected ShowIterator shows;
	protected FoodIterator food;
	private HashMap<Integer, Review> reviews = new HashMap<Integer, Review>();
	protected ShowFactory factory;
	
	public Venue(String name, String location) {
		this.name = name;
		this.location = location;
		type = "";
		shows = new ShowIterator();
		factory = new ShowFactory();
	}
	
	public String getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public Review getReviews() {
		//TODO get specific review
		return null;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void printShows() {
		shows.printShows();
	}
	
	public void printShow(Show show) {
		
	}
	
	public void printFood() {
		
	}
	public void addReview( int id,String review, int rating, User user) {
		reviews.put(id,new Review(rating, review, user));
	}
	public String getVenueReview(String review) {
		return review;
	}
	/**
	 * adds a Review to the venue
	 * @param stars, stars given the venue
	 * @param review, review itself
	 */
	

	public String toString() {
		return "Name: " + name + "\nType: " + type + "\nLocation: " + location + "\nReviews:\n" + this.getReviews();
  }
}