import java.util.HashMap;

public class Show {
	public static HashMap<Integer, Review> MReview = new HashMap<Integer, Review>();
	public Show(Integer movieid, String name, String description, double price, String moviedate, String movietime,
			Integer venueid) {
		// TODO Auto-generated constructor stub
	}
	public void addingreview( int id,String review, int rating) {
		MReview.put(id,new Review(rating, review, null));
}
}
