package Pack2;

public class Truck extends Vehicle{
	
	private double cargoCapacity;
	private double towingCapacity;
	
	
	//constructor
	public Truck(String make, String model, int year, double fuelCapacity, double cargoCapacity, double towingCapacity) {
		super(make, model, year, fuelCapacity);
		this.cargoCapacity = cargoCapacity;
		this.towingCapacity = towingCapacity;
	}
	
	//method `calculateFuelEfficiency()` that returns the fuel efficiency of the truck.
	public double calculateFuelEfficiency () {
		return getFuelCapacity() / towingCapacity;
		
	}

	//Polymorphic Display:
	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		super.displayInfo();
		System.out.println("The cargo Capacity: " + cargoCapacity);
        System.out.println("The towing Capacity: " + towingCapacity );
        System.out.println("Fuel Efficiency: " + calculateFuelEfficiency());
	}

	public double getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(double cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	public double getTowingCapacity() {
		return towingCapacity;
	}

	public void setTowingCapacity(double towingCapacity) {
		this.towingCapacity = towingCapacity;
	}

	
	}
	

	


