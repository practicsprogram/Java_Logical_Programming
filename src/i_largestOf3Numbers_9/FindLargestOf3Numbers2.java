package i_largestOf3Numbers_9;

import java.util.Scanner;

public class FindLargestOf3Numbers2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        System.out.println("Enter Third Number");
        int c = sc.nextInt();

        // Approach 2 - Ternary Operator

        int largest = a>b?a:b;
        int largest1 = c>largest?c:largest;

        System.out.println(largest1 + " is the largest number");
    }
}
