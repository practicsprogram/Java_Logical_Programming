package w_sortElementsInArrayUsingBuiltInMethods_23;

import java.util.Arrays;

public class SortElementsInArrayUsingBuiltInMethods1 {
	
	public static void main(String[] args) {
		
		// Approach 1
		
		int a[] = {30,50,20,10,60};
		
		System.out.println("Array elements before sorting : " + Arrays.toString(a));
		
		Arrays.parallelSort(a);
		
		System.out.println("Array elements after sorting : " + Arrays.toString(a));
 	}
}
