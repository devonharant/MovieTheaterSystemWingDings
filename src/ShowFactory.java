/**
 * 
 * @author WingDings
 */

public class ShowFactory {
	
	public Show createShow(String name, String description, String time, Review review, int theaterRows, int theaterColumns) {
		Show newShow = new Show(name, description, time, review, theaterRows, theaterColumns);
		return newShow;
	}
}
