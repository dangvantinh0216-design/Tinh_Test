package lap3_4;

public class Route {
	private String origin;
	private String destination;
	//Contructor
	public Route(String origin, String destination) {
		super();
		this.origin = origin;
		this.destination = destination;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	//Phương thức kiểm tra 2 ga đích có trùng không
	public boolean sameDestination(String destinationThat ) {
		return this.getDestination().equals(destinationThat);
	}
}
