package ze_patterns_31;

/*
 * 	Inverted Half Pyramid With Numbers
 * 
 * 	1
 * 	1 2
 * 	1 2 3
 * 	1 2 3 4
 * 	1 2 3 4 5
 */

public class InvertedHalfPyramidWithNumbers {
	
	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i=1 ; i<=row ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
	}
}
