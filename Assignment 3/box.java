class Box{
	private double length;
	private double width;
	private double height;
	Box(){
		length = 0;
		height = 0;
		width = 0;
	}
	Box(double length,double width,double height){
		this.length = length;
		this.height = height;
		this.width = width;
	}
	public void displayDimensions() {
		System.out.println("Length = "+this.length+ " Width = "+this.width +" Height = "+this.height);
	}
	public double volume() {
		return this.length*this.width*this.height;
	}
	public double getLength() {
		return this.length;
	}
	public double getHeight() {
		return this.height;
	}
	public double getWidth() {
		return this.width;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
}
class Main{ 
	public static void main(String args[]) {
		Box box = new Box(1,2,3);
		box.displayDimensions();
		System.out.println("Volume "+box.volume());
		box.setHeight(2);
		box.setLength(3);
		box.setWidth(11);
		System.out.println("Length: "+box.getLength()+" Width "+box.getWidth()+" Height "+box.getHeight());
		System.out.println("Volume: "+box.volume());
	}
}
