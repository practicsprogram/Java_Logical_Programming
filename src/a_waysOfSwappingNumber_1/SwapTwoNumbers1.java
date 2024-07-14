package a_waysOfSwappingNumber_1;

public class SwapTwoNumbers1 {
    public static void main(String[] args) {
        int a = 50;
        int b = 80;

        System.out.println("Before swaping a is "+a+" and b is "+b);

        // Logic 1 : Third Variable

        int c = a;
        a = b;
        b = c;

        System.out.println("After swaping a is "+a+" and b is "+b);
    }
}
