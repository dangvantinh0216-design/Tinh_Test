package lap3_4;

public class Train {
	private Schedule schedule;
    private Route route;
   private boolean local;
    //Contructor
	public Train(Schedule schedule, Route route, boolean local) {
		super();
		this.schedule = schedule;
		this.route = route;
		this.local = local;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	public boolean isLocal() {
		return local;
	}
	public void setLocal(boolean local) {
		this.local = local;
	}
	//Câu 1 : Ga đích có trùng không ?
	public boolean sameDestination( String destination) {
		return this.route.sameDestination(destination);
	}
	//Câu 2 : Tàu khởi hành lúc mấy giờ ?
	public ClockTime startTime() {
		return this.schedule.getDeparture();
	}
	//Câu 3 : Thời gian di chuyển bao lâu ?
	public int travelDuration() {
		return this.schedule.travelTime() ;
	}

}
