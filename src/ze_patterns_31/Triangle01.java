package ze_patterns_31;

/*
 * 	0 - 1 Triangle
 * 
 * 	1
 * 	0 1
 * 	1 0 1
 * 	0 1 0 1
 *  1 0 1 0 1
 */

public class Triangle01 {
	
	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i=1 ; i<=row ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				int sum = i+j;
				if(sum%2 == 0)
				{
					System.out.print("1 ");
				}
				else
				{
					System.out.print("0 ");
				}
			}
			
			System.out.println();
		}
	}
}
