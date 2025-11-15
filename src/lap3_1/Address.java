package lap3_1;

public class Address {
	private String houseNumber;
	private String streetName;
	private String city;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String houseNumber, String streetName, String city) {
		super();
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.city = city;
	}
	public boolean inThisCity(String thatCity) {
		return this.getCity().equals(thatCity);
	}
	public boolean sameCity(Address other) {
		return this.getCity().equals(other.getCity());
	}

	

}
