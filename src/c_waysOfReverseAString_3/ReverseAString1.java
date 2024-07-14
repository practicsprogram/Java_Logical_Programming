package c_waysOfReverseAString_3;

public class ReverseAString1 {

    public static void main(String[] args) {

        // 1 - Using + (string concatenation) operator

        String str = "ABED";
        System.out.println("Before reversing " + str);

        int length = str.length(); // 4
        System.out.println("length of str is " + length);

        /*
                  A B C D
        length is 1 2 3 4
        index is  0 1 2 3
         */

        String rev = ""; // Empty string

        for(int i=length-1 ; i>=0 ;  i--) // 3 2 1 0 -1
        {
            rev = rev + str.charAt(i); // D C B A
        }

        System.out.println("Reverse String is " + rev);
    }
}
