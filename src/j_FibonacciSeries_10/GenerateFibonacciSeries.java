package j_FibonacciSeries_10;

/*
A series of numbers in which each number (Fibonacci number) is the sum of the two preceding numbers.
0 1 1 2 3 5 8 13 21 34
 */

public class GenerateFibonacciSeries {

    public static void main(String[] args) {

        int n1 = 0 , n2 = 1 , sum = 0;

        System.out.print(n1 + " " + n2);

        for (int i=2 ; i<10 ; i++) // 0 and 1 is already printed so start from 2 i.e. i=2
        {
            sum = n1 + n2; // 1 2 .....

            System.out.print(" " + sum); // 0 1 1 2 3 ......

            n1=n2;
            n2=sum;
        }
    }
}
