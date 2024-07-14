package b_waysOfReverseANumber_2;

import java.util.Scanner;

public class ReverseANumber3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number ");

        int num = sc.nextInt();

        // 3 - Using StringBuilder Class

        StringBuilder sbl = new StringBuilder(); // created an object of StringBuilder Class

        sbl.append(num);
        /*
        sbl.append(num) --> append is a method which append the num into sbl reference variable
        so now sbl have num
         */

        StringBuilder rev = sbl.reverse();

        System.out.println("Reverse Number is " + rev);
    }
}
