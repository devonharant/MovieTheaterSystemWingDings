
import java.util.*;
public class ShowIterator implements Iterator{
	
	private HashMap<String, Show> shows;
	
	/**
	 * constructor
	 * @param hashmap of shows denoted by show times
	 */
	public ShowIterator(){
		shows = new HashMap<>();
	}
	
	/**
	 * 
	 * @param show
	 */
	public void addShow(Show show) {
		shows.put(show.getName(), show);
	}
	
	/**
	 * checks if there is another show in the hashmap 
	 * not really used, hashmaps are iterable by themselves
	 * @returns whether the hashmap has a next
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
	
	public void printShows() {
		for(HashMap.Entry<String, Show> entry : shows.entrySet()) {
			System.out.println(entry.getValue().toStringShort());
		}
	}
	
}
