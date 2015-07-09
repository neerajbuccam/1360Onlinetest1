import static org.junit.Assert.*;

import org.junit.Test;


public class ButtonTest {

	@Test
	public void testCast_vote() {
		Button b = new Button();
		assertEquals(0, b.cast_vote(5));
	}

}
