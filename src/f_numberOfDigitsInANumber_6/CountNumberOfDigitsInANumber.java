package f_numberOfDigitsInANumber_6;

/*
Number = 123456 ---> Digits = 6
 */

public class CountNumberOfDigitsInANumber {

    public static void main(String[] args) {

        int num = 85496325;

        int count = 0;

        while (num>0) // 123456 12345 1234 123 12 1 0
        {
            num = num/10; // 12345  1234  123  12  1
            count++; // 1 2 3 4 5 6
        }

        System.out.println("Number of Digits : " + count);
    }

}
