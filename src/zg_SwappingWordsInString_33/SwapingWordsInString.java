package zg_SwappingWordsInString_33;

import java.util.Scanner;

public class SwapingWordsInString {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = sc.nextLine();
		
		String result = swapFirstAndLastWords(input);
		System.out.println("Swapped string : " + result);
		
		sc.close();
	}
	
	public static String swapFirstAndLastWords(String input)
	{
		String words[] = input.trim().split(" ");
		if(words.length < 2)
		{
			return input;
		}
		
		words[0] = words[0] + words[words.length - 1];
		words[words.length - 1] = words[0].substring(0, words[0].length() - words[words.length - 1].length());
		words[0] = words[0].substring(words[words.length - 1].length());
		
		return String.join(" ", words);
	}
}
