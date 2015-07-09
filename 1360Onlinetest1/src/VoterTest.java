import static org.junit.Assert.*;

import org.junit.Test;


public class VoterTest {

	@Test
	public void testCast_vote() {
		Voter v = new Voter(2,5);
		assertEquals(0, v.cast_vote(2, 5));
	}

}
