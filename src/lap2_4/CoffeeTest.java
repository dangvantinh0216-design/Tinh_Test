package lap2_4;

import junit.framework.TestCase;

public class CoffeeTest extends TestCase {
	public void testCost_NoDiscount() {
        Coffee c = new Coffee("Arabica", 5.0, 3000);
        // 3000 * 5 = 15000, không giảm
        assertEquals(15000.0, c.cost());
    }

    public void testCost_TenPercentDiscount() {
        Coffee c = new Coffee("Robusta", 5.0, 10000);
        // 10000 * 5 = 50000, giảm 10% => 45000
        assertEquals(45000.0, c.cost());
    }

    public void testCost_TwentyFivePercentDiscount() {
        Coffee c = new Coffee("Moka", 10.0, 20000);
        // 20000 * 10 = 200000, giảm 25% => 150000
        assertEquals(150000.0, c.cost());
    }

}
