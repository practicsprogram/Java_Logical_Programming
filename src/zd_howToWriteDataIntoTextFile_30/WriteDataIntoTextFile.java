package zd_howToWriteDataIntoTextFile_30;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\Sandeep Anand\\Desktop\\abc.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Selenium with java");
		bw.write("Selenium with Python");
		bw.write("Selenium with C#");
		
		System.out.println("Finished !!!!!!");
		
		bw.close();
	}
}
