package Pack2;

public class Motorcycle extends Vehicle  {
	
		private String typeOfMotorcycle;

		public Motorcycle(String make, String model, int year, double fuelCapacity, String typeOfMotorcycle) {
			super(make, model, year, fuelCapacity);
			this.typeOfMotorcycle = typeOfMotorcycle;
		}


		public double calculateFuelEfficiency () {
			return getFuelCapacity() / typeOfMotorcycle;
		}


		@Override
		public void displayInfo() {
			// TODO Auto-generated method stub
			super.displayInfo();
			System.out.println("The cargo Capacity: " + typeOfMotorcycle);
	        System.out.println("Fuel Efficiency: " + calculateFuelEfficiency());
		}


		public String getTypeOfMotorcycle() {
			return typeOfMotorcycle;
		}


		public void setTypeOfMotorcycle(String typeOfMotorcycle) {
			this.typeOfMotorcycle = typeOfMotorcycle;
		}
			
			
				
		}
		
		
	


