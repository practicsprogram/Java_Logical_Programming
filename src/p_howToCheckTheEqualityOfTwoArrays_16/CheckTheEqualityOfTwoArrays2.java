package p_howToCheckTheEqualityOfTwoArrays_16;

public class CheckTheEqualityOfTwoArrays2 {
	
	public static void main(String[] args) {
		
		// Approach 2 : own logic without using equals method
		
		int a1[] = {1,2,31,4,5};
		int a2[] = {1,2,3,4,5};
		
		boolean status = true;
		
		
		if(a1.length == a2.length)
		{
			for(int i=0 ; i<a1.length ; i++)
			{
				if(a1[i] != a2[i])
				{
					status = false;
				}
			}
		}
		else
		{
			status = false;
		}
		
		if(status == true)
		{
			System.out.println("Arrays is Equals");
		}
		else
		{
			System.out.println("Arrays is NOT Equals");
		}
	}
}
