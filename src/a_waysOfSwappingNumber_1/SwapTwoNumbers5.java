package a_waysOfSwappingNumber_1;

public class SwapTwoNumbers5 {
    public static void main(String[] args) {
        int a = 30;
        int b = 90;

        System.out.println("Before swaping a is "+a+" and b is "+b);

        // Logic 5 : Single Statement

        b = a + b - ( a = b); // 30 + 90 - ( 90 ) = 30

        System.out.println("After swaping a is "+a+" and b is "+b);
    }
}
