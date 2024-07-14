package i_largestOf3Numbers_9;

import java.util.Scanner;

public class FindLargestOf3Numbers3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        System.out.println("Enter Third Number");
        int c = sc.nextInt();

        // Approach 3 - Ternary Operator

        int largest = (a>b?a:b)>c?(a>b?a:b):c;

        System.out.println(largest + " is Largest Number");
    }
}
