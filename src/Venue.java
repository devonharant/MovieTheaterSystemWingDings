
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
	
  protected int venueid;
	protected String name;
	protected String location;
	protected String type;
	protected ShowIterator shows;
	protected FoodIterator food;
	private HashMap<String, Review> reviews = new HashMap<String, Review>();
	protected ShowFactory factory;
	
	public Venue(String name, String location) {
		this.name = name;
		this.location = location;
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
	public void addingreview( int id,String review, int rating) {
		Review.put(id,new Review(rating, review, null));
	}
	public String getvenueReveiew(String review) {
		return review;
	}
	/**
	 * adds a Review to the venue
	 * @param stars, stars given the venue
	 * @param review, review itself
	 */
	

	public String toString() {
		return "Name: " + name + "\nType: " + type + "\nLocation: " + location + "\nReviews:\n" + this.getAllReviews();
  }
}