class Hotel{
	private String name;
	private String address;
	public Hotel(String name,String address) {
		this.name = name;
		this.address = address;
	}
	public void display() {
		System.out.println("Hotel Name: "+this.name+" Address: "+this.address);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address =address;
	}
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
	
}
class Main{ 
	public static void main(String args[]) {
		Hotel hotel = new Hotel("Taj", "Sigra, Varanasi");
		hotel.display();
		// setting name and address using setter methods
		hotel.setAddress("Cantt, Varanasi");
		hotel.setName("Fairmont");
		// displaying address and name using getter methods.
		System.out.println("Name: "+hotel.getName()+" Address: "+hotel.getAddress());
		
	}
}
