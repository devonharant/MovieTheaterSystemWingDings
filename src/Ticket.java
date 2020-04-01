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

	/**
	 * Ticket with food constructor
	 * @param show
	 * @param time
	 * @param seats
	 * @param food
	 * @param price
	 */
	public Ticket(Show show,String time, String[] seats, Food[] food, double price) {

		this.setShow(show);
		this.setTime(time);
		this.setSeats(seats);
		this.setFood(null);
		this.setPrice(price);
	}
	
	/**
	 * Ticket without food constructor
	 * @param show
	 * @param time
	 * @param seats
	 * @param price
	 */
	public Ticket(Show show,String time, String[] seats, double price) {

		this.setShow(show);
		this.setTime(time);
		this.setSeats(seats);
		this.setFood(null);
		this.setPrice(price);
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
	
	/**
	 * returns the seats array as a string
	 * @return the seats array as a string
	 */
	public String seatsToString() {
		String ret = "";
		for(int i = 0; i < seats.length; i++) {
			ret = ret + seats[i] + " ";
		}
		return ret;
	}

	public String toString() {
		return                   /*   "/\
                                      /  \
                                     / /\ \
                                    / /  \ \
                                   / /    \ \
                                  / /      \ \
                                 / /        \ \
                                / /          \ \
                               / /            \ \
_ _____  _ _ _  ___ __________/ /              \ \_____________________________
`|_   _|| |_| || __|___________/                \________________________  ,-'
   | |`-|  _  || _|                                                  ,-',-'
   |_|`-|_| |_||___|                                             _,-',-'
  ____    `-.`-____        ____        ___      ___  ___  _____,-_,-'________
 |    \      `/    |    ,-'    `-.    |   |    |   ||   ||        | /        |
 |     \     /     |-.,'  __  __  `.  |   |    |   ||   ||    ____||    _____|
 |      \   /      |-/   /  \/  \   \ |   |    |   ||   ||   |____ |   (____
 |       \_/       ||    \      /    ||   |    |   ||   ||        ||        \
 |   |\       /|   ||     |     ]    | \   \  /   / |   ||    ____| \____    |
 |   | \     / |   |/\    |____|    /   \   \/   /  |   ||   |____  _____)   |
 |   |  \   /  |   | / .  ,' | `. ,'   , \      /   |   ||        ||         |
 |___|   \_/   |___|/   `-.____,-'  ,-',`-\____/    |___||________||________/
                 / /             ,-',-' `-.`-.             \ \
                / /           ,-',-'       `-.`-.           \ \
               / /         ,-',-'             `-.`-.         \ \
              / /       ,-',-'                   `-.`-.       \ \
            / /     ,-',-'                         `-.`-.     \ \
            / /   ,-',-'                               `-.`-.   \ \
           / / ,-',-'                                     `-.`-. \ \
          / /-',-'                                           `-.`-\ \
         /_,-'`                                                 `'-._\"
				 + */"Show: " + show.getName() + "\nTime: " + time + "\nSeats: " + seatsToString() +"\nPrice: " + price;
				 //+ "\nFood: " + food.toString();
	}
}
