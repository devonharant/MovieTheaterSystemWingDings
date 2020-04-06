/**
 * PlayHouse class extending Venue
 * that shows plays specifically
 * @author WingDings
 */
public class PlayHouse extends Venue{

	public PlayHouse(String name, String location) {
		super(name, location);
		type = "Play House";
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
