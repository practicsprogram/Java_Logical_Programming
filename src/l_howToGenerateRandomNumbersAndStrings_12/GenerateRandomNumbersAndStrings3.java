package l_howToGenerateRandomNumbersAndStrings_12;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumbersAndStrings3 {
	
	public static void main(String[] args) {
		
		//Approach 3 - Apache commons-lang API
		//https://commons.apache.org/proper/commons-lang/index.html
	
	String randString = RandomStringUtils.randomAlphabetic(5);
	System.out.println(randString);
	
	String randNum = RandomStringUtils.randomNumeric(10);
	System.out.println(randNum);
	}
}
