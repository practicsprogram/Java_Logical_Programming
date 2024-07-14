package g_numberOfEvenAndOddDigitsinANumber_7;

/*
Number = 145678
Even Digits : 3   Odd Digits : 3
 */

public class CountNumberOfEVENAndODDDigitsInANumber {

    public static void main(String[] args) {

        int num = 1234567;

        int even_count = 0;
        int odd_count = 0;

        while (num>0)
        {
            int rev = num%2;

            if (rev == 0)
            {
                even_count++;
            }

            else
            {
                odd_count++;
            }

            num = num/10;
        }

        System.out.println("Number of Even Number is : " + even_count);
        System.out.println("Number of Odd Number is : " + odd_count);
    }
}
