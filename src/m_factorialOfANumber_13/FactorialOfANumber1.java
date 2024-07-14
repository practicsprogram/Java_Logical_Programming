package m_factorialOfANumber_13;

/*
 * A factorial is a function that multiplies a number by every number below it.
 * For example : 
 * 5! = 5*4*3*2*1 = 120
 * OR
 * 5! = 1*2*3*4*5 = 120
 */

public class FactorialOfANumber1 {
	
	public static void main(String[] args) {
		
		// 5! = 1*2*3*4*5 = 120
		
		int num = 5;
		long factorial = 1;
		
		for(int i=1 ; i<=num ; i++)
		{
			factorial = factorial*i;
		}
		
		System.out.println("Factorial of a Number is : " + factorial);
	}
}
