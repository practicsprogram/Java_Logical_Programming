package ze_patterns_31;

/*
 * 	Half Pyramid
 * 
 * 	*
 * 	* *
 *  * * *
 *  * * * *
 */

public class HalfPyramid {
	
	public static void main(String[] args) {
		
		int row = 4;
		
		for(int i=1 ; i<=row ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
