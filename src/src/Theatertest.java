package src.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Theatertest {

	Theater theatertest = new Theater(9, 8, 6, 6, "12:00PM", "AA:");

	@Test
	void test() {
		fail("Not yet implemented");
	}

	public void testTheater() {
		int id = 9;
		int produced = theatertest.getID();
		assertEquals(id, produced);
	}
}
