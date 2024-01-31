package Pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		Scanner sc1 = null;
		Scanner sc2 = null;
		PrintWriter pw = null;
		System.out.println("Give me the file 1 name you want read: "); 
		String s1 = kb.nextLine();
		
		System.out.println("Give me the file 2 name you want read "); // second n which name i wanna use for the copy file that i selected in the first step 
		String s2 = kb.nextLine();
		
		System.out.println("Give me the file name you want to create with the output "); // second n which name i wanna use for the copy file that i selected in the first step 
		String s3 = kb.nextLine();
		
		try {
			sc1 = new Scanner ( new  FileInputStream(s1));
			sc2 = new Scanner ( new  FileInputStream(s2));
			pw = new PrintWriter (new FileOutputStream(s3));
		}catch(FileNotFoundException e) {
			System.out.println("The file is not found");
			System.exit(0);
		}
	//	================================= this if statement it not belong to this main, cause i have to print in a different file 
		if (compareFiles(sc1, sc2, pw)) {
            System.out.println("The contents of both files are identical");
        } else {
            System.out.println("The contents of both files are different");
        }

        sc1.close();
        sc2.close();
        pw.close();
			
					
		compareFiles(sc1, sc2, pw); // name of the method, that i have to called in the main
		System.out.println("Done");
		
	
}

	public static boolean compareFiles(Scanner sc1, Scanner sc2,  PrintWriter pw) { // Creat the method outsite of the main
			
		while (sc1.hasNextLine() && sc2.hasNextLine()) {
            String line1 = sc1.nextLine();
            String line2 = sc2.nextLine();

            if (!line1.equals(line2)) {
                return false;
            }
            
                  }

        return !sc1.hasNextLine() && !sc2.hasNextLine();
    }
			
}

	

	

