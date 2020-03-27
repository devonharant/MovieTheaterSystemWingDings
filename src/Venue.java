/**
 * Venue abstract class to be implemented by children
 * forcing characteristics and methods to be used
 * by the children
 * @author WingDings
 */
public abstract class Venue{
	
	protected String name;
	protected String location;
	protected String type;
	//protected Show[] shows;
	//protected Food[] food;
	//protected Review review;
	
	public Venue() {
		name = "";
		location = "";
		type = "";
	}
	public abstract String getName();
	public abstract String getLocation();
	public abstract String getType();
	//public abstract Review getReview();
	public abstract void setName(String name);
	public abstract void setLocation(String location);
	public abstract void printShows();
	public abstract void printFood();
	
	public String toString() {
		return "Name: " + name + "\nType: " + type + "\nLocation: " + location;
	}
}