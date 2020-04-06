import java.util.HashMap;

public class Venue{
	protected int venueid;
	protected String name;
	protected String location;
	protected String type;
	//protected ShowIterator[] shows;
//	protected FoodIterator food;
	protected Review review;
//	protected ShowFactory factory;
	public static HashMap<Integer, Review> Review = new HashMap<Integer, Review>();
	public Venue() {
		
		name = "";
		location = "";
		type = "";
		//shows = new ShowIterator();
		//factory = new ShowFactory();
	}
	public void addingreview( int id,String review, int rating) {
		Review.put(id,new Review(rating, review, null));
	}
	public String getvenueReveiew(String review) {
		return review;
	}
	//creates a show with the show factory and adds it to the iterator
	//public abstract createShow();

	public Venue(Integer venueid2, String name2, String type2, String location2) {
		
	}


	public String toString() {
		return "Name: " + name + "\nType: " + type + "\nLocation: " + location;
	}
}