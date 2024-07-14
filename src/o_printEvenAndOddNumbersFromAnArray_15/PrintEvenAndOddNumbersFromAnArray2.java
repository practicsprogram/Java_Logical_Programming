package o_printEvenAndOddNumbersFromAnArray_15;

public class PrintEvenAndOddNumbersFromAnArray2 {
		
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6};
		
		// Enhanced for loop
		
		// Extracting even numbers ........
		
		System.out.println("Even number in array ...... ");
		
		for(int value : a)
		{
			if(value%2 == 0)
			{
				System.out.println(value);
			}
		}
		
		// Extracting odd numbers ........
		
		System.out.println("Odd number in array ...... ");
		
		for(int value : a)
		{
			if(value%2 != 0)
			{
				System.out.println(value);
			}
		}
	}
}
