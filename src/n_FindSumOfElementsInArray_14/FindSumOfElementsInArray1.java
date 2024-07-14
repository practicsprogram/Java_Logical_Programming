package n_FindSumOfElementsInArray_14;

/*
 * Array with 5 elements
 * SUM = a[0] + a[1] +  a[2] + a[3] + a[4]
 *     =  5   +  2   +   7   +  9   +  6
 *     =  29
 */

public class FindSumOfElementsInArray1 {
	
	public static void main(String[] args) {
		
		int a[] = {5,2,7,9,6};
		int length = a.length;
		System.out.println(length);
		
		int sum = 0;
		
		for(int i=0 ; i<=a.length-1 ; i++)
		{
			sum = sum + a[i];
		}
		
		System.out.println("Sum of Array elements : " + sum);
	}
}
