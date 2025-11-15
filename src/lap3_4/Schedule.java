package lap3_4;

public class Schedule {
	private ClockTime departure;
	private ClockTime arrival;
	//Contructor
	public Schedule(ClockTime departure, ClockTime arrival) {
		super();
		this.departure = departure;
		this.arrival = arrival;
	}
	//Lấy thời gian đi
	public ClockTime getDeparture() {
		return this.departure;
	}
	//Tính thời gian di chuyển
	public int travelTime() {
		return this.arrival.difference(this.departure);
	}
	

}
