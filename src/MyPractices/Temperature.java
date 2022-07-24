package MyPractices;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.println("\nThis programs calculates the Average Temperature of days\n");
                 Scanner console = new Scanner(System.in);
                System.out.print("How many days' temperatures? ");
                int numDays = console.nextInt();
                 int sum = 0;
                 for (int i = 1; i <= numDays; i++) {
                    System.out.print("Day " + i + "'s high temp: ");
                            int next = console.nextInt();
                     sum += next;
                    }
                double average = (double) sum / numDays;
                System.out.println();
                System.out.println("Average = " + average);

            }
        }


