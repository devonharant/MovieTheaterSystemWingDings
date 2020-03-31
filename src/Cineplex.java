/**
 * Cineplex class extending Venue
 * that shows movies specifically
 * @author WingDings
 */
public class Cineplex extends Venue{

	//public ShowFactory showFactory;
	
	public Cineplex() {
		type = "Cineplex";
	}
	
	/**
	 * getType method that returns the type of the venue
	 * @return type
	 */
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
}
