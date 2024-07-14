package l_howToGenerateRandomNumbersAndStrings_12;

import java.util.Random;
import java.util.stream.DoubleStream;

public class GenerateRandomNumbersAndStrings1 {

    public static void main(String[] args) {

        // Approach 1 - Random

        Random rand = new Random();

        int rand_int = rand.nextInt(10);
        System.out.println(rand_int);

        double rand_double = rand.nextDouble(); // 0 to 1
        System.out.println(rand_double);

        double rand_double1 = rand.nextDouble(10);
        System.out.println(rand_double1);
    }
}
