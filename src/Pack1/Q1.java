package Pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q1 {

	public static void main(String[]args) {
			
							
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
				
						
			CountWords(sc, pw); // name of the method, that i have to called in the main
			System.out.println("Done");
			
		
	}
	
	public static void CountWords(Scanner sc, PrintWriter pw) { // Create the method outside of the main
		
		String s;		
						
		int c = 0;
		while(sc.hasNext()) { // while you have words count 
			sc.next();
			c++;
		
		}
		pw.println("There are " + c + " words");
		pw.close();
	}
}