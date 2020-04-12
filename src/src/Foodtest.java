package src.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import junit.framework.TestCase;

public class Foodtest extends TestCase{
	private Food testFood = new Food(1, "Test Food", 20.99, 1, 1);
	
	@BeforeEach
	public void setUp() throws Exception {
		
	}

	@AfterEach
	public void tearDown() throws Exception {
		
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	public void getCost() {
		double testCost = testFood.getCost();
		double expected = 20.99;
		assertEquals(testCost, expected);
	}
}
