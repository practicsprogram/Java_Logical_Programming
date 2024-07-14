package v_bubbleSort_22;

import java.util.Arrays;

public class SortElementsInArray {
	
	public static void main(String[] args) {
		
		int a[] = {4,2,1,5,3};
		
		System.out.println("Array before sorting : " + Arrays.toString(a));
		
		int n = a.length; // n = 5 so number of passes is n-1 = 5-1 = 4
		System.out.println(n);
		
		for(int i=0 ; i<n-1 ; i++) // Number of Passes
		{
			for(int j=0 ; j<n-1 ; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		System.out.println("Array After sorting : " + Arrays.toString(a));
  	}
}
