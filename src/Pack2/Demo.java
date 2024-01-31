package Pack2;

import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Vehicle> vehicles = new ArrayList<>();;
	
		vehicles.add(new Car("Mazda", "lite", 2024, 14, 4, 5));
        vehicles.add(new Truck("Ford", "F24", 2024, 20.0, 50.0, 10000.0));
	
        
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle: " + vehicle.getMake() + " " + vehicle.getModel());
            System.out.println("Fuel Efficiency: " + vehicle.calculateFuelEfficiency());
            System.out.println();
	
	}
 // from Question # 6 writing and Reading 
        
        PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(new FileOutputStream("fleet_info.txt", true));// I have to called true in orden to get append in my txt
			
		}catch(FileNotFoundException e) {
			System.out.println("the file is not found");
		}
	
		Scanner kb = new Scanner(System.in);
		System.out.println("please give me the vehicle: ");
		String Vehicle = kb.nextLine();
		System.out.println("please give me the Model (Year) : ");
		String Model = kb.nextLine();
		System.out.println("please give me Fuel Capacity: ");
		String Capacity = kb.nextLine();
		
						
		pw.println("Your vehicle is: " + Vehicle);
		pw.println("The model is: " + Model);
		pw.println("The capacity is: " + Capacity);
		pw.println("=====================================");
		pw.close();
		
		
	
	}
	

}
