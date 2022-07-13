package MyPractices;

import java.util.Scanner;

public class AverageOfSequence {
    public static void main(String[] args) {

    System.out.println("This program examines a sequence");

            System.out.println("of numbers to find the average");

                    System.out.println("and count how many are negative.");
    System.out.println();


    Scanner console = new Scanner(System.in);

    System.out.print("How many Students do you have? ");
     int totalNumber = console.nextInt();

    int negatives = 0;
    int excellent = 0;
     double sum = 0.0;
        System.out.println("Enter Student's score:");
     for (int i = 1; i <= totalNumber; i++) {
         System.out.print("Student " + i + ": ");
                double next = console.nextDouble();
         sum += next;
         if (next < 0) {

            negatives++;

        }
         if (next>=75){
             excellent++;
         }

     }
    System.out.println();


    if (totalNumber <= 0) {

        System.out.println("No numbers to average");
    } else {
        double average = sum / totalNumber;
         System.out.printf("average = %.2f%n", average);
        }
     System.out.println("number of negatives = " + negatives);
        System.out.println("Outstanding student = " + excellent);
}
}
