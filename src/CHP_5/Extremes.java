package CHP_5;

import java.util.Scanner;
import java.lang.Math;
public class Extremes {
    public static void main(String[] args) {
        //calculate sum of maximum and minimum numbers entered

        Scanner figure = new Scanner(System.in);
        int counter = 0;
        int minimum = 0;
        int maximum = 0;
        int sum = 0;
        int total = 0;
        int number = 0;
        System.out.println("Enter 5 number of values you want :");
        do {
            number = figure.nextInt();
            sum = maximum + minimum;
            total += number;
            counter++;
            {
                if (number > maximum) {
                    maximum = number;
                }

                    if (number < minimum) {
                        minimum = number;
                    }
                }

        }
        while ( counter < 5 );



        System.out.println("The total of values entered is : " + total);
        System.out.println("Maximum number is : " + maximum);
        System.out.println("Your minimum number is : " + minimum);
        System.out.println("Sum of maximum and minimu numbers is : " + sum);
      }


        }


