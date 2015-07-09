import static org.junit.Assert.*;

import org.junit.Test;


public class Control_UnitTest {

	@Test
	public void testResetCounters() {
		Control_Unit CU = Control_Unit.create_CU(5);
		assertEquals(0, CU.resetCounters());
	}

}
