package zc_howToReadDataFromTextFile_29;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromTextFile2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		// Approach 2 : Using Scanner & File
		
		File file = new File("C:\\Users\\Sandeep Anand\\Desktop\\xpath.txt");
		
		Scanner sc = new Scanner(file);
		
		// loop statement
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
	}
}
