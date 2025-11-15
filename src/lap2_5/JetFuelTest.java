package lap2_5;

import junit.framework.TestCase;

public class JetFuelTest extends TestCase {
	public void testTotalCost() {
		JetFuel jf1 = new JetFuel(50000, "A1", 20);
		assertEquals(jf1.totalCost(), 1000000);
		JetFuel jf2 = new JetFuel(120000, "A2", 15);
		assertEquals(jf2.discountPrice(), 1620000.0);
		
	}

}
