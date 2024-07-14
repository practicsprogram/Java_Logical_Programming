package zb_howToReverseEachWordInAString_28;

public class ReverseEachWordInAString1 {
	
	public static void main(String [] args) {
		
		// Approach 1ReverseEachWordInAString1
	
		String str = "Welcome To Java and Selenium"; // Original String
	
		String[] words = str.split(" "); // Splitting string into words
	
		String reverseString = "";
	
		for(String w : words) // Java
		{
			String reverseWord = "";
		
			for(int i=w.length()-1 ; i>=0 ; i--) // To
			{
				reverseWord = reverseWord + w.charAt(i);
			}
		
			reverseString = reverseString + reverseWord + " "; // emoclew ot avaj
		}
	
		System.out.println(reverseString);
	}
}
