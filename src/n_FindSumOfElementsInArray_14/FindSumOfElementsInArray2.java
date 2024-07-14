package n_FindSumOfElementsInArray_14;

public class FindSumOfElementsInArray2 {
	
	public static void main(String[] args) {
		
		// Enhanced for loop
		
		int a[] = {5,2,7,9,6};
		
		int sum = 0;
		
		for(int value:a)
		{
			sum = sum + value;
		}
		
		System.out.println("Sum of Array elements : " + sum);
	}
}
