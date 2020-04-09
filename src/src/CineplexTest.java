package src;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;

public class CineplexTest extends TestCase{
	
	Venue cineplex = new Cineplex("Test Plex", "USC");
	
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
	
	@Test
	public void testGetType() {
		String type = "Cineplex";
		String produced = cineplex.getType();
		assertEquals(type, produced);	
	}
	
}
