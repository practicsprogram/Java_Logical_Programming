package w_sortElementsInArrayUsingBuiltInMethods_23;

import java.util.Arrays;
import java.util.Collections;

public class SortElementsInArrayUsingBuiltInMethods3 {
	
	public static void main(String[] args) {
		
		// Reverse Descending order
		
		//int a[] = {30,50,20,10,60};
			// not accept by collections because it is primitive order
		
		Integer a[] = {30,50,20,10,60};
		
		System.out.println("Array elements before sorting : " + Arrays.toString(a));
		
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println("Array element after sorting : " + Arrays.toString(a));
	}
}
