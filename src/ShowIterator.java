
import java.util.*;
public class ShowIterator implements Iterator{
	private HashMap<String, Show> shows;
	
	
	/**
	 * constructor
	 * @param hashmap of shows denoted by show times
	 */
	public ShowIterator(HashMap<String, Show> shows){
		//todo fill
	}
	
	/**
	 * checks if there is another show in the hashmap 
	 * @returns wether the hashmap has a next
	 */
	public boolean hasNext() {
		return true;
	}
	
	/**
	 * returns the next show;
	 * @return the next show in the hashmap
	 */
	public Show next() {
		return null;
	}
	
}