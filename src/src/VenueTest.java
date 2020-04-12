package src.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VenueTest {
	Venue venue = new Venue(9 ,"Place", "Concert Hall", "Columbia");

	@Test
	void test() {
		fail("Not yet implemented");
	}

	public void testGetName() {
		String nametest = "Place";
		String produced = venue.getName();
		assertEquals(nametest, produced);
	}
}
