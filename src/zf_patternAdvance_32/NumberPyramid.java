package zf_patternAdvance_32;

public class NumberPyramid {
	
	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i=1 ; i<=row ; i++)
		{
			//spaces
			for(int j=1 ; j<=row-i ; j++)
			{
				System.out.print(" ");
			}
			
			//numbers -> print row no., row no. times
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(i + " ");
			}
			
			System.out.println();
		}
	}
}
