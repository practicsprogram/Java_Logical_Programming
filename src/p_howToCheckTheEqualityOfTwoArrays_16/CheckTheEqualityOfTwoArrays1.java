package p_howToCheckTheEqualityOfTwoArrays_16;

import java.util.Arrays;

public class CheckTheEqualityOfTwoArrays1 {
	
	public static void main(String[] args) {
		
		int a1[] = {1,2,3,4,5};
		int a2[] = {1,2,3,4,5};
		
		// Approach 1 : Equals method
		
		boolean status = Arrays.equals(a1, a2);
		
		if(status == true)
		{
			System.out.println("Arrays is Equal");
		}
		
		else
		{
			System.out.println("Arrays is NOT Equals");
		}
	}
}
