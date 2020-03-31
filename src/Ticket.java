/**
 * Ticket class to be had by User that
 * holds all the show information as well as
 * food information
 * @author WingDings
 */
public class Ticket {
	protected Show show;
	protected String time;
	protected String[] seats;
	protected double price;
	protected Food[] food;
	protected int points;


	public Ticket(Show show, String[] seats, Food[] food, double price, int points) {
		this.setShow(show);
		this.setTime(show.getTime());
		this.setSeats(seats);
		this.setFood(food);
		this.setPrice(price);
		this.setPoints(points);

	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points){
		this.points = points;
	}

	public String[] getSeats() {
		return seats;
	}

	public void setSeats(String[] seats) {
		this.seats = seats;
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
		return "Show: " + show + "\nTime: " + time + "\nSeats" + seats.toString() +"\nPrice: " + price + "\nFood: " + food.toString();
	}
}
