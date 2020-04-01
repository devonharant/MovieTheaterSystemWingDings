

public class TestDriver {
	public static void main(String[] args) {
        Venue Nickelodeon = new Cineplex();
        Admin Xavier = new Admin("Xavier", "09/09/1999", "notanemail@gmail.com", "GOD", "****", 12, Nickelodeon );
        System.out.println(Xavier.toString());
        Xavier.addShowListing();
        Show show = Nickelodeon.shows.next();
        Xavier.createTicket(show);
    }
}
