package ze_patterns_31;

/*	Solid Rectangle
 * 
 * 	* * * * *
 * 	* * * * *
 * 	* * * * *
 *  * * * * * 
 */

public class SolidRectangle {
	
	public static void main(String[] args) {
		
		int row = 4;
		int column = 5;
		
		for(int i=1 ; i<=row ; i++) // outer for loop for row
		{
			for(int j=1 ; j<=column ; j++) // inner for loop for column
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
