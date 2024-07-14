package zc_howToReadDataFromTextFile_29;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromTextFile3 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		// Approach 3
		
		File file = new File("C:\\Users\\Sandeep Anand\\Desktop\\xpath.txt");
		
		Scanner sc = new Scanner(file);
		
		sc.useDelimiter("\\Z");
		
		System.out.println(sc.next());
	}
}
