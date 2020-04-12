package src.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class PlayHousetest {

	Venue playhouse = new PlayHouse("house Test", "USC");
	@Test
	void test() {
		fail("Not yet implemented");
	}

	public void testGetType() {
		String type = "Play House";
		String produced = playhouse.getType();
		assertEquals(type, produced);
	}
}
