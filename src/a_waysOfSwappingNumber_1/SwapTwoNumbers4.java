package a_waysOfSwappingNumber_1;

public class SwapTwoNumbers4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 14;

        System.out.println("Before swaping a is "+a+" and b is "+b);

        // Logic 4 : bitwise XOR (^)

        a = a ^ b; // 10 ^ 14 = 1010 ^ 1110 = 0100 = 4
        b = a ^ b; // 4 ^ 14 = 0100 ^ 1110 = 1010 = 10
        a = a ^ b; // 4 ^ 10 = 0100 ^ 1010 = 1110 = 14

        System.out.println("After swaping a is "+a+" and b is "+b);
    }
}
