package a_waysOfSwappingNumber_1;

public class SwapTwoNumbers3 {
    public static void main(String[] args) {
        int a = 40;
        int b = 30;

        System.out.println("Before swaping a is "+a+" and b is "+b);

        // Logic 3 : use * and / and without using third variable
            // here a and b should not be zero(0)

        a = a * b; // 40 * 30 = 1200;
        b = a / b; // 1200 / 30 = 40;
        a = a / b; // 1200 / 40 = 30;

        System.out.println("After swaping a is "+a+" and b is "+b);
    }
}
