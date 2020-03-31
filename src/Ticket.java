/**
 * Ticket class to be had by User that 
 * holds all the show information as well as
 * food information
 * @author WingDings
 */
public class Ticket {
	protected Show show;
	protected String time;
	protected double price;
	protected Food[] food;
	protected String[] seats;
	
	public Ticket() {
		this.time = show.getTime();
	}
	
	public Show getShow() {
		return show;
	}
	
	public String getTime() {
		return time;
	}
	
	public double getPrice() {
		return price;
	}
	
	public Food[] getFood() {
		return food;
	}
	
	public void setShow(Show show) {
		this.show = show;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setFood(Food[] food) {
		this.food = food;
	}
	
	public String toString() {
		return "Show: " + show + "\nTime: " + time + "\nPrice: " + price + "\nFood: " + food;
	}
}
