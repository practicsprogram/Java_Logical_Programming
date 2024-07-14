package ze_patterns_31;

/*
 * 	InvertedHalfWithNumbers
 * 	
 * 	1 2 3 4 5
 * 	1 2 3 4
 *  1 2 3
 *  1 2
 *  1
 */

public class InvertedHalfWithNumbers {
	
	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i=1 ; i<=row ; i++)
		{
			for(int j=1 ; j<=row-i+1 ; j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
}
