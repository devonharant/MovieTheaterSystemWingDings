package src.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tickettest {
	Tickettest tickettest = new Ticket(null ,"12:00PM", null , null, 6);

	@Test
	void test() {
		fail("Not yet implemented");
	}
	public void testGetTicket() {
		String timetest = "12:00PM";
		String produced = tickettest.getTime();
		assertEquals(timetest, produced);
	}

}
