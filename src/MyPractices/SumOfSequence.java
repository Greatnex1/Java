package MyPractices;

import java.util.Scanner;

public class SumOfSequence {
    public static void main(String[] args) {
        double sum = 0.0;
        System.out.println("This program adds a sequence of");
                System.out.println("numbers.");
                System.out.println();

        Scanner console = new Scanner(System.in);

        System.out.print("How many numbers do you have? ");
        int totalNumber = console.nextInt();
        System.out.println("Enter your " + totalNumber + " numbers");
        for (int i = 1; i <= totalNumber; i++) {
            System.out.print("#" + i + "? ");
            double next = console.nextDouble();
            sum += next;
            }
        System.out.println();
        System.out.println("sum = " +(int) sum);
        printHailstoneMaxMin(5,2);
    }
    public static void printHailstoneMaxMin(int value, int length)
    {
        int min = value;
        int max = value;
        for (int i = 1; i <= length - 1; i++) {
        if (value % 2 == 0) {value = value / 2;
        } else {
            value = 3 * value + 1;
        }
        if (value > max) {
            max = value;
        } else if (value < min) {
            min = value;
        }
    }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}

