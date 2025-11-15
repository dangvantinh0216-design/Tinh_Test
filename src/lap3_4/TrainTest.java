package lap3_4;

import junit.framework.TestCase;

public class TrainTest extends TestCase {
	public void testSameDestination () {
		ClockTime dep = new ClockTime (8, 30);
		ClockTime arr = new ClockTime (14, 45);
		Schedule sch = new Schedule (dep, arr);
		Route route = new Route("Hà Nội", "Đà Nẵng");
        Train train = new Train(sch, route, true);
        assertTrue(train.sameDestination("Đà Nẵng"));
        assertFalse(train.sameDestination("Hà Nội"));
	}
	public void testStartTime() {
		ClockTime dep = new ClockTime (8, 30);
		ClockTime arr = new ClockTime (14, 45);
		Schedule sch = new Schedule (dep, arr);
		Route route = new Route("Hà Nội", "Đà Nẵng");
        Train train = new Train(sch, route, true);
        assertEquals(train.startTime().toString(), "08:30");
        ClockTime dep2 = new ClockTime (10, 30);
        Schedule sch2 = new Schedule (dep2, arr);
        Train train2 = new Train(sch2, route, true);
        assertEquals(train2.startTime().toString(), "10:30");
	}
	public void testTravelDuration() {
		ClockTime dep = new ClockTime (8, 30);
		ClockTime arr = new ClockTime (14, 45);
		Schedule sch = new Schedule (dep, arr);
		Route route = new Route("Hà Nội", "Đà Nẵng");
        Train train = new Train(sch, route, true);
        assertEquals(train.travelDuration(), 375);
	}
	

}
