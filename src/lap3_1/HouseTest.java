package lap3_1;

import junit.framework.TestCase;

public class HouseTest extends TestCase {
	public void testHasMoreRooms() {
		House h1 = new House("Ranch", 7, new Address("23", "Maple Street", "Brookline"), 375000);
		House h2 = new House("Colonial", 9, new Address("5", "Joye Road", "Newton"), 450000);
		House h3 = new House("Cape", 6, new Address("83", "Winslow Road", "Waltham"), 235000);
		assertTrue(h1.hasMoreRooms(h3));
		assertFalse(h1.hasMoreRooms(h2));
	}
	public void testInThisCity() {
		House h1 = new House("Ranch", 7, new Address("23", "Maple Street", "Brookline"), 375000);
		House h2 = new House("Colonial", 9, new Address("5", "Joye Road", "Newton"), 450000);
		House h3 = new House("Cape", 6, new Address("83", "Winslow Road", "Waltham"), 235000);
		assertTrue(h1.inThisCity("Brookline"));
		assertFalse(h2.inThisCity("Brookline"));
	}
	public void testSameCity() {
		House h1 = new House("Ranch", 7, new Address("23", "Maple Street", "Brookline"), 375000);
		House h2 = new House("Colonial", 9, new Address("5", "Joye Road", "Newton"), 450000);
		House h3 = new House("Cape", 6, new Address("83", "Winslow Road", "Waltham"), 235000);
		assertTrue(h1.sameCity(h1) );
		assertFalse(h2.sameCity(h3));
	}

}
