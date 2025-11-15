package lap2_2;

public class MovieTheater {
	private double ticketPrice;
	private double fixedCost;
	private double serviceFee;
	public MovieTheater(double ticketPrice, double fixedCost, double serviceFee) {
		super();
		this.ticketPrice = ticketPrice;
		this.fixedCost = fixedCost;
		this.serviceFee = serviceFee;
	}
	public double toltalProfit ( int attendees ) {
		double income = attendees * ticketPrice ;
		double cost = fixedCost + attendees * serviceFee ;
		return income - cost;
		
	}

	

}
