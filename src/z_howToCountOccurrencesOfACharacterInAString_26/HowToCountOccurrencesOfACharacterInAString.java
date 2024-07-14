package z_howToCountOccurrencesOfACharacterInAString_26;

public class HowToCountOccurrencesOfACharacterInAString {
	
	public static void main(String[] args) {
		
		String s = "Java Programming Java oops";
		
		int totalcount = s.length(); // total length 
		
		int totalcount_afterRemove_a = s.replace("a", "").length();
			// total length after removing a's
		
		int count = totalcount - totalcount_afterRemove_a;
		
		System.out.println("Number occurance of a is : " + count);
	}
}
