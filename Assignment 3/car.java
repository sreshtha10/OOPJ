class Car{
	private double mileage;
	Car(double mileage){
		this.mileage = mileage;
	}
	public void displayMileage() {
		System.out.println("Mileage "+this.mileage);
	}
	public double getMileage() {
		return this.mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
}
class Main{ 
	public static void main(String args[]) {
		Car tesla = new Car(22.4);
		tesla.displayMileage();
		tesla.setMileage(12);
		System.out.println("Mileage "+tesla.getMileage());
	}
}
