package zf_patternAdvance_32;

public class PalindromicPattern {
	
	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i=1 ; i<=row ; i++)
		{
			// spaces
			for(int j=1 ; j<=row-i ; j++)
			{
				System.out.print(" ");
			}
			
			// 1st half numbers
			for(int j=i ; j>=1 ; j--)
			{
				System.out.print(j);
			}
			
			// 2nd half numbers
			for(int j=2 ; j<=i ; j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
			
			/*
			 * for(int j=1 ; j<=i ; j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
			 */
		}
	}
}
