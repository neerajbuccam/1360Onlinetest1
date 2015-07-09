import static org.junit.Assert.*;

import org.junit.Test;


public class Balloting_UnitTest {

	@Test
	public void testClosePoll() {
		Control_Unit CU = Control_Unit.create_CU(5);
		Balloting_Unit BU = Balloting_Unit.create_BU(CU.ballot_buttons);
		assertEquals(0, BU.closePoll());
	}

}
