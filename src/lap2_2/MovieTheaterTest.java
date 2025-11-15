package lap2_2;

import junit.framework.TestCase;

public class MovieTheaterTest extends TestCase {
	public void testTotalProfit () {
		MovieTheater mt1 = new MovieTheater(5.0, 20.0, 0.50);
		MovieTheater mt2 = new MovieTheater(10.0, 20.0, 0.50);
		MovieTheater mt3 = new MovieTheater(5.0, 20.0, 2.0);
		assertEquals(mt1.toltalProfit(40), 160.0);
		assertEquals(mt2.toltalProfit(40), 360.0);
		assertEquals(mt3.toltalProfit(40), 100.0);
		
	}

}
