package Pack2;

public class Car extends Vehicle {
	
	private int numDoors;
	private double trunkCapacity;
	
	
	//constructor
	public Car (String make, String model, int year, double fuelCapacity, int numDoors, double trunkCapacity) {
		super(make, model, year, fuelCapacity);
		this.setNumDoors(numDoors);
		this.setTrunkCapacity(trunkCapacity);
		
	}

//Implement a method `calculateFuelEfficiency()` that returns the fuel 
	//efficiency of the car. 
	
	public double calculateFuelEfficiency() {
		 return getFuelCapacity() / trunkCapacity;
		 
		 
		 
	}
	//Polymorphic Display:
	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		super.displayInfo();
		System.out.println("Number of Doors: " + numDoors);
        System.out.println("Trunk Capacity: " + trunkCapacity );
        System.out.println("Fuel Efficiency: " + calculateFuelEfficiency());
	}

	public double getTrunkCapacity() {
		return trunkCapacity;
	}



	public void setTrunkCapacity(double trunkCapacity) {
		this.trunkCapacity = trunkCapacity;
	}



	public int getNumDoors() {
		return numDoors;
	}



	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}
	
	
	

}
