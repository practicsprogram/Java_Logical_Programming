package c_waysOfReverseAString_3;

public class ReverseAString3 {

    public static void main(String[] args) {

        // 3 - Using String Buffer Class

        String str = "ABCD";
        System.out.println("Before reversing " + str);

        StringBuffer sb = new StringBuffer(str);
        /*
        passing the str data into  StringBuffer class
         */

        System.out.println("Reverse String is " + sb.reverse());
    }
}
