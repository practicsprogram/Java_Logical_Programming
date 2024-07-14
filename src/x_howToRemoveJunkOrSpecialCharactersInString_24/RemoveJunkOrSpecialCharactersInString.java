package x_howToRemoveJunkOrSpecialCharactersInString_24;

public class RemoveJunkOrSpecialCharactersInString {
	
	public static void main(String[] args) {
		
		String s = "D3l!ghtfUl5tr@ng3m3nt";
		
		String s1 = "Ex@mPl3C0nundrUm$";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		
		System.out.println(s1);
	}
}
