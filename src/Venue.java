/**
 * Venue abstract class to be implemented by children
 * forcing characteristics and methods to be used
 * by the children
 * @author WingDings
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class Venue{
	
	protected String name;
	protected String location;
	protected String type;
	protected ShowIterator shows;
	protected FoodIterator food;
	private HashMap<String, Review> reviews = new HashMap<String, Review>();
	protected ShowFactory factory;
	
	public Venue() {
		name = "";
		location = "";
		type = "";
		shows = new ShowIterator();
		factory = new ShowFactory();
	}
	
	public abstract String getType();
	
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
	
	/**
	 * adds a Review to the venue
	 * @param stars, stars given the venue
	 * @param review, review itself
	 */
	public void addReview(String userName, Review review) {
		this.reviews.put(userName, review);
	}
	
	/**
	 * creates a string of all the reviews of the venue
	 */
	public String getAllReviews() {
		String ret = "";
		for(Entry<String, Review> r:reviews.entrySet()) {
			 ret = ret + r.getValue().toString() +"\n\n";
		}
		return ret;
	}

	public String toString() {
		return "Name: " + name + "\nType: " + type + "\nLocation: " + location + "\nReviews: " + this.getAllReviews();
	}
}