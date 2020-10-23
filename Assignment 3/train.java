class Train{
	private String source;
	private String destination;
	Train(String source,String destination){
		this.source = source;
		this.destination = destination;
	}
	public void display() {
		System.out.println("Source: "+this.source+" Destination: "+this.destination);
	}
	public String getSource() {
		return this.source;
	}
	public String getDestination() {
		return this.destination;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
}
class Main{ 
	public static void main(String args[]) {
		Train train = new Train("Varanasi", "Jaipur");
		train.display();
		train.setDestination("New Delhi");
		train.setSource("Chennai");
		System.out.println("Source: "+train.getSource()+" Destination: "+train.getDestination());
	}
}
