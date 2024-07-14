package a_waysOfSwappingNumber_1;

public class SwapTwoNumbers2 {
    public static void main(String[] args) {
        int a = 50;
        int b = 60;

        System.out.println("Before swaping a is "+a+" and b is "+b);

        // Logic 2 : use + & - without using third variable

        a = a + b; // 50 + 60 = 110
        b = a - b; // 110 - 60 = 50
        a = a - b; // 110 - 50 = 60

        System.out.println("After swaping a is "+a+" and b is "+b);
    }
}
