package MyPractices;

import java.util.Scanner;

public class TemperatureReader {
    public static void main(String[] args) {
        System.out.println("\nThis programs calculates the Average Temperature of days\n");
        Scanner reader = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int numDays = reader.nextInt();
//        store temperature in an array and find average
        int[] temp = new int[numDays];

int sum = 0;
        for (int i = 0; i <numDays ; i++) {
            System.out.println("Day" + i + 1 + "'s temperature");
            temp[i] = reader.nextInt();
            sum = sum + temp[i];
        }
        double average = (double) sum / numDays;
//            temperature above average
       int high = 0;

//       or using for-loop
//        for (int weather = 0; weather < temp.length ; weather++) {
//            if(weather>average){
//                high++;
//            }
//        }
// using enhanced-for
        for (int weather : temp) {
            if (weather > average) {
                high++;
            }
            System.out.println();
            System.out.println("Average = " + average);

            System.out.println( high + "Hot days or the days above average");
        }

        }

    }

