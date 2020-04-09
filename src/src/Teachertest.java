package src.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
class Teachertest extends TestCase{

	UserDecorator teachertest = new Teacher();
	@Test
	void test() {
		fail("Not yet implemented");
	}
	public void testGetDiscount() {
		double disc = 10;
		double produced = teachertest.getDiscount();
		assertEquals(disc, produced);
	}

}
