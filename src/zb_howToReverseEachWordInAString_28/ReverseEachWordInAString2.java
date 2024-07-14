package zb_howToReverseEachWordInAString_28;

public class ReverseEachWordInAString2 {
	
	public static void main(String[] args) {
		
		// Approach 2
		
		String str = "Welcome To Java";
		
		String[] words = str.split("\\s");
		
		String reverseWord = "";
		
		for(String w : words) // Java
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse(); // avaJ
			
			reverseWord = reverseWord + sb.toString() + " "; //emocleW oT avaJ
		}
		
		System.out.println(reverseWord);
	}
}
