package s_howToFindDuplicateElementsInArray_19;

public class FindDuplicateElementsInArray1 {
	
	public static void main(String[] args) {
		
		// Approach 1
		
		String arr[] = {"java" , "C" , "C++" , "Python" , "java" , "C"};
		
		boolean flag = false;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println("Found Duplicate Element : " + arr[i]);
					flag = true;
				}
			}
			
			if(flag == false)
			{
				System.out.println("Duplicate Element Not Found");
			}
		}
	}
}
