package zf_patternAdvance_32;

public class SolidRhombus {
	
	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i=1 ; i<=row ; i++)
		{
			// spaces
			for(int j=1 ; j<=row-i ; j++)
			{
				System.out.print(" ");
			}
			
			// stars
			for(int j=1 ; j<=5 ; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
