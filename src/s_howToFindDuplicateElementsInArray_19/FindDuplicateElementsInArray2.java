package s_howToFindDuplicateElementsInArray_19;

import java.util.HashSet;

public class FindDuplicateElementsInArray2 {
	
	public static void main(String[] args) {
		
		// Approach 2 : HashSet
		
		String arr[] = {"java" , "C" , "C++" , "Python" , "java" , "C"};
		
		HashSet <String>langs = new HashSet();
		
		boolean flag = false;
		
		for(String l : arr)
		{
//			System.out.println(langs.add(l));
//			boolean ab = langs.add(l);
			
			if(langs.add(l) == false)
			{
				System.out.println("Found Duplicate Element : " + l);
				flag = true;
			}
		}
		
		if(flag == false)
		{
			System.out.println("Not found Duplicates");
		}
	}
}
