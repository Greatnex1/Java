package CHP_4;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total;
        int counter = 0;
        while (counter != -1) {
            System.out.print("Enter miles driven :");
           int miles = scan.nextInt();
            System.out.print("Enter gallon used : ");
           int gallon = scan.nextInt();
            total = miles * gallon ;
            counter += 1;


            System.out.println("Distance trip  " + total);

        }
//            if (gallon != 0) {
//                double average = (double) total / counter;
//                System.out.printf(" Miles  travelled per trip is %.2f%n ", average);
            }

        }

