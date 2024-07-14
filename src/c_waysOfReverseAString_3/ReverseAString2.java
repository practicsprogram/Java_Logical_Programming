package c_waysOfReverseAString_3;

public class ReverseAString2 {

    public static void main(String[] args) {

        // 2 - Using Character Array

        String str = "ABCD";
        System.out.println("Before reversing " + str);

        char a[] = str.toCharArray();
        /*
        char a[] = str.toCharArray() --> so here we are converting String data into Character format by using .toCharArray()
        and storing it into a[] (a Array reference variable)
         */

        int length = str.length();
        System.out.println("length of str is " + length);

        String rev = "";

        for (int i=length-1 ; i>=0 ; i--)
        {
            rev = rev + a[i];
        }

        System.out.println("Reverse String is " + rev);
    }
}
