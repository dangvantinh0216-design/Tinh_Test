package lap3_1;

public class House {
	private String kind;
	private int nRooms;
	private Address address;
	private int price;
	public int getNRooms() {
		return nRooms;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setnRooms(int NRooms) {
		this.nRooms = nRooms;
	}
	public House(String kind, int nRooms, Address address, int price) {
		super();
		this.kind = kind;
		this.nRooms = nRooms;
		this.address = address;
		this.price = price;
	}
	public boolean hasMoreRooms(House other) {
		return this.getNRooms() > other.getNRooms();
	}
	public boolean inThisCity(String city) {
		return this.address.inThisCity(city);
	}
	public boolean sameCity(House other) {
		return this.address.sameCity(other.getAddress());
	}
	

}
