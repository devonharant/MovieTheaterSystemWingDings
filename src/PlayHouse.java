/**
 * PlayHouse class extending Venue
 * that shows plays specifically
 * @author WingDings
 */
public class PlayHouse extends Venue{

	//public ShowFactory showFactory;
	
	public PlayHouse() {
		type = "Play House";
	}
	
	/**
	 * getName method that returns the name of the venue
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * getLocation method that returns the location of the venue
	 * @return location
	 */
	public String getLocation() {
		return location;
	}
	
	/**
	 * getType method that returns the type of the venue
	 * @return type
	 */
	public String getType() {
		return type;
	}
	
	/*public Review getReview() {
		return null;
	}*/
	
	/**
	 * setName method that sets the name of the specified venue
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * setLocation method that sets the location of the specified venue
	 * @param location
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	/**
	 * printShows method that prints the shows that are showing at this venue
	 * using the show iterator
	 * @return shows currently viewing
	 */
	public void printShows() {
		
	}
	
	/**
	 * printFood method that prints the food currently available at this venue
	 * using the food iterator
	 * @return food at venue
	 */
	public void printFood() {
		
	}
}
