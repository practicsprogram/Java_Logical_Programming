package ze_patterns_31;

/*
 * 	Floyd's Triangle
 * 	
 * 	1
 * 	2  3
 *  4  5  6
 *  7  8  9  10
 *  11 12 13 14 15
 */

public class FloydsTriangle {
	
	public static void main(String[] args) {
		
		int row = 5;
		int number = 1;
		
		for(int i=1 ; i<=row ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(number + " ");
				number++; // number = number + 1
			}
			
			System.out.println();
		}
	}
}
