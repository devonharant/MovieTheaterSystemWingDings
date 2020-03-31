/**
 * Venue abstract class to be implemented by children
 * forcing characteristics and methods to be used
 * by the children
 * @author WingDings
 */
import java.util.HashMap;

public abstract class Venue{
	
	protected String name;
	protected String location;
	protected String type;
	protected ShowIterator shows;
	protected FoodIterator food;
	protected Review review;
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
	public Review getReview() {
		return review;
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

	public String toString() {
		return "Name: " + name + "\nType: " + type + "\nLocation: " + location;
	}
}