/**
 * ConcertHall class extending Venue
 * that shows concerts specifically
 * @author WingDings
 */
public class ConcertHall extends Venue{
	
	//public ShowFactory showFactory;
	
	public ConcertHall() {
		type = "Concert Hall";
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
