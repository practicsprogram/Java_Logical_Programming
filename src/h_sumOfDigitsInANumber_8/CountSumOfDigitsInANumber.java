package h_sumOfDigitsInANumber_8;

/*
Number = 1234
Sum = 1+2+3+4 = 10
 */

public class CountSumOfDigitsInANumber {

    public static void main(String[] args) {

        int num = 123456;

        int sum = 0;

        while (num>0)
        {
            sum = sum + num%10;
            num = num/10;
        }

        System.out.println("Sum of Digits in a number : " + sum);
    }
}
