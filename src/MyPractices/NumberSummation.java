package MyPractices;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberSummation {
//    A program that reads an input file of numbers, prints the numbers and their sum

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        Scanner scan = new Scanner(new File("numbers.dat"));
        double sum = 0.0;
        int count = 0;
        while (scan.hasNextDouble()){
            double next = scan.nextDouble();
            count++;
            System.out.println("number " + count + " = " + next); Thread.sleep(180);
            sum +=next;

        }
        System.out.println("Sum = " + sum);

    }
}
