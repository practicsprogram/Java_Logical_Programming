package u_binarySearch_21;

import java.util.Arrays;

public class SearchingAnElementInArray2 {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,10}; // Should be in sorted order
		
		// Approach 2 : Arrays.binarySearch()
		
		System.out.println(Arrays.binarySearch(a, 16));
			// 5 is at index number 4
			// if number is not present than it will return -ve value
			// 16 is not there so it will return -11
		
		/*
		 * pre-requiest
		 * in binary search array is in sorted order and in liner search array is in not sorted order
		 */
	}
}
