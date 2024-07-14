package e_howToCheckGivenStringIsPalindromeOrNot_5;

import java.util.Scanner;

/*
A Palindrome String is a String that remains the same when its characters are reversed.
Like : MADAM
 */

public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String:");

        String str = sc.next();

        String org_Str = str;
        System.out.println("Original String is : " + org_Str);

        int length = str.length();
        System.out.println("Length of String is : " + length);

        String rev = "";

        for (int i=length-1 ; i>=0 ; i--)
        {
            rev = rev + str.charAt(i);
        }

        System.out.println("Reversed String is : " + rev);

        if (org_Str.equals(rev))
        {
            System.out.println(org_Str + " is Palindrome String");
        }

        else
        {
            System.out.println(org_Str + " is not Palindrome String");
        }
    }
}
