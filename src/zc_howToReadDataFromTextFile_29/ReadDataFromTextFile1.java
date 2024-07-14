package zc_howToReadDataFromTextFile_29;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTextFile1 {
	
	public static void main(String[] args) throws IOException {
		
		// Approach 1 : Using FileReader BufferReader
		
		FileReader fr = new FileReader("C:\\Users\\Sandeep Anand\\Desktop\\xpath.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		
		while((str = br.readLine()) != null)
		{
			System.out.println(str);
		}
		
		br.close();
	}
}
