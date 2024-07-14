package y_howToRemoveWhiteSpacesInAString_25;

public class RemoveWhiteSpacesInAString {
	
	public static void main(String[] args) {
		
		String str = "Java    programming    selenium    automation";
		
		System.out.println("Before removing the white spaces : " + str);
		
		str = str.replaceAll("\\s", "");
		
		System.out.println("After removing the white spaces : " + str);
	}
}
