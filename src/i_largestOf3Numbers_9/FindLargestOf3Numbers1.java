package i_largestOf3Numbers_9;

import java.util.Scanner;

public class FindLargestOf3Numbers1 {

    public static void main(String[] args) {

        // Approach 1 - Logic

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        System.out.println("Enter Third Number");
        int c = sc.nextInt();

        if (a>b && a>c)
        {
            System.out.println(a + " is the Largest number");
        }

        else if (b>a && b>c)
        {
            System.out.println(b + " is the Largest number");
        }

        else
        {
            System.out.println(c + " is the Largest number");
        }
    }
}
