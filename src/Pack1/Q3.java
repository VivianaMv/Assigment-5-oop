package Pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		Scanner sc = null;
		PrintWriter pw = null;
		System.out.println("Give me the file name you want read: "); // first i have to select the file that i wanna copy
		String s1 = kb.nextLine();
		
		System.out.println("Give me the file name you want to create with the output "); // second n which name i wanna use for the copy file that i selected in the first step 
		String s2 = kb.nextLine();
		
		try {
			sc = new Scanner ( new  FileInputStream(s1));
			pw = new PrintWriter (new FileOutputStream(s2));
		}catch(FileNotFoundException e) {
			System.out.println("The file is not found");
			System.exit(0);
		}
			
					
		CharacterFrequencyCounter(sc, pw); // name of the method, that i have to called in the main
		System.out.println("Done");
		
	
}

		public static void CharacterFrequencyCounter(Scanner sc, PrintWriter pw) { // Create the method outside of the main
	
			 int[] frequency = new int[256]; // Assuming ASCII characters

			 pw.println("The frequency of each character is: ");  
			 while (sc.hasNextLine()) {
		            String line = sc.nextLine();
		            for (int i = 0; i < line.length(); i++) {
		                char ch = line.charAt(i);
		                if (Character.isLetterOrDigit(ch)) {
		                    frequency[ch]++;
		                }
		            }
		        }

		        for (int i = 0; i < frequency.length; i++) {
		            if (frequency[i] > 0) {
		            	
		            	pw.println("Character: " + (char) i + ", Frequency: " + frequency[i]);
		            }
		        }
		        pw.close();
		    }
		}