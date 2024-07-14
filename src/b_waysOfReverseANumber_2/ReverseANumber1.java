package b_waysOfReverseANumber_2;

import java.util.Scanner;

public class ReverseANumber1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");

        int num = sc.nextInt(); // 1234

        // 1 - Using algorithm

        int rev = 0;

        while(num != 0)
        {
            rev = rev * 10 + num % 10;
            /*
            1st ---> 0*10 + 1234%10 = 0 + 4 = 4
            2nd ---> 4*10 + 123%10 = 40 + 3 = 43
            3rd ---> 43*10 + 12%10 = 430 + 2 = 432
            4th ---> 432*10 + 1%10 = 4320 + 1 = 4321
                    10)1(0
                       0
                      ---
                       1  --->> 10*0 = 0 , 10*1 = 10
                     ------
             */
            num = num / 10;
            /*
            1st ---> 1234/10 = 123
            2nd ---> 123/10 = 12
            3rd ---> 12/10 = 1
            4th ---> 1/10 = 0
             */
        }

        System.out.println("Reverse Number is " + rev);
    }
}
