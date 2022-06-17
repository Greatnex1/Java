package MyPractices;

import java.util.Scanner;

public class Largest_Number {
    public static void main(String... args) {
        int x;
        int y;
        int z;
        Scanner w = new Scanner(System.in);
        System.out.println("Enter a number: ");
         x = w.nextInt();
        System.out.println("Enter a second number: ");
        y = w.nextInt();
        System.out.println("Enter a third number: ");
        z = w.nextInt();
        LargestNumberCalculator calculator = new LargestNumberCalculator();
        int largest = calculator.calculateLargest(x,y,z);
        System.out.println("largest is " + largest);


    }

}