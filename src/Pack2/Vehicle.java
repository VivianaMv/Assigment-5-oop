package Pack2;

public class Vehicle {
	
	private String make;
	private String model;
	private int year;
	private double fuelCapacity;
	

	//parameterized constructor
•	public Vehicle(String make, String model, int year, double fuelCapacity) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.fuelCapacity = fuelCapacity;
}
//parameterized constructor and a method `displayInfo()` to display the basic information about the vehicle.

// method `displayInfo()
	public void displayInfo() {
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
		System.out.println("Fuel Capacity: " + fuelCapacity + " gallons");
}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

}	
	