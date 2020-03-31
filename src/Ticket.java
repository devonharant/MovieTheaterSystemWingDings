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
		return                           " /\
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
         /_,-'`                                                 `'-._\" +
				 "Show: " + show + "\nTime: " + time + "\nSeats" + seats.toString() +"\nPrice: " + price + "\nFood: " + food.toString() + "\nPoints: " +points;
	}
}
