package MyPractices;

import java.util.Random;

public class RandomOdd {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(); // save random number into a variable
        if (n % 2 == 0) {
            System.out.println("Even number: " + n);
        } else {
            System.out.println("Odd number: " + n);
        }
    }
}
