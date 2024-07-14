package ze_patterns_31;

/*
 * 	Inverted Half Pyramid Rotated by 180 degree
 * 
 * 	       *
 *       * *
 *     * * *
 *   * * * *
 */

public class InvertedHalfPyramidRotated180 {
	
	public static void main(String[] args) {
		
		int row = 4;
		
		for(int i=1 ; i<=row ; i++) // Outer loop
		{
			for(int j=1 ; j<=row-i ; j++) // Inner loop --> space print
			{
				System.out.print(" ");
			}
			
			for(int j=1 ; j<=i ; j++) // Inner loop --> star print
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
