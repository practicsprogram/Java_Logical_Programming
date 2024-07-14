package d_howToCheckGivenNumberIsPalindromeOrNot_4;

/*
A Palindrome Number is a number that remains the same when its digits are reversed.
Like 16461
 */

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int num = sc.nextInt();

        int org_num = num;

        System.out.println("Before reversing the number : " + org_num);

        int rev_num = 0;

        while (num != 0)
        {
            rev_num = rev_num*10 + num%10;
            num = num/10;
        }

        System.out.println("After reversing the number : " + rev_num);

        if (org_num == rev_num)
        {
            System.out.println(org_num + " Palindrome Number");
        }

        else
        {
            System.out.println(org_num + " Not Palindrome Number");
        }
    }
}
