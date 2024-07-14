package b_waysOfReverseANumber_2;

import java.util.Scanner;

public class ReverseANumber2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number ");

        int num = sc.nextInt();

        // 2 - Using StringBuffer Class

        StringBuffer sb = new StringBuffer(String.valueOf(num)); //  creating an object of StringBuffer Class
        /*
        (String.valueOf(num) --> here we are converting the int number into the String format
        StringBuffer(String.valueOf(num)) --> than we are passing that into the StringBuffer Constructor
         sb = new StringBuffer(String.valueOf(num)); ---> and than we are storing it into sb reference variable
         StringBuffer sb = new StringBuffer(String.valueOf(num)); ---> and StringBuffer is the return type so this a data type
         */

        StringBuffer rev = sb.reverse();
        /*
        StringBuffer has a method called as reverse() which will reverse the data
         */

        System.out.println("Reverse Number is " + rev);
    }
}
