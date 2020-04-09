package src.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {

	User user = new User(12, "chris", "nix", "11/16/1998", "noemail@gmail.com", "ca",
			"password", 20, true);
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

	public void testGetName() {
		String name = "chris nix";
		String producedName = user.getName();
		assertEquals(name, producedName);
	}
}
