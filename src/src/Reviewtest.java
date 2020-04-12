package src.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Reviewtest {

	private Review testReview = new Review(5, "ligma", "bob");
	
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
	
	public void testGetStars() {
		int testStars = testReview.getStars();
		int expected = 5;
		assertEquals(testStars, expected);
	}
}
