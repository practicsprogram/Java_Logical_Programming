package m_factorialOfANumber_13;

public class FactorialOfANumber2 {
	
	// 5! = 5*4*3*2*1 = 120
	
	public static void main(String[] args) {
		
		int num = 6;
		long factorial = 1;
		
		for(int i=num ; i>=1 ; i--)
		{
			factorial = factorial*i;
		}
		
		System.out.println("Factorial of a Number is : " + factorial);
	}

}
