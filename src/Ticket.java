/**
 * 
 * @author WingDings
 */
public class Ticket {
	protected Show show;
	protected String time;
	protected double price;
	protected Food[] food;
	
	public Ticket() {
		
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
}
