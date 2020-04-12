package src.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Showtest {

	Show showtest = new Show(9, "Frozen 2", "its empty", 15, 9);

	@Test
	void test() {
		fail("Not yet implemented");
	}
	public void getShowName() {
		String nametest = "Frozen 2";
		String produced = showtest.getName();
		assertEquals(nametest, produced);
	}

}
