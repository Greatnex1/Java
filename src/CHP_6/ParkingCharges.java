package CHP_6;

import java.util.Scanner;

public class ParkingCharges {
    public static Scanner parking = new Scanner(System.in);
    private static double costs;

    public static void main(String... args) {

        int clientNumber = 1;

        System.out.printf("Enter number of parking hours for client %d or 0 to exit :", clientNumber);

        int parking_Hour = parking.nextInt();
        parkingCost(parking_Hour);
        parking.nextLine();


        double totalAmount = 0;

        while (parking_Hour != 0) {


            totalAmount += costs;

            clientNumber++;

            System.out.printf(" Enter number of parking hours for customer %d or 0 to exit :", clientNumber);
            parking_Hour = parking.nextInt();
            parkingCost(parking_Hour);
            parking.nextLine();

        }

        System.out.printf("The total charges for yesterday is #%.2f.%n", totalAmount);

        System.out.println("Thank you for parking");

    }


    public static double parkingCost(int hours) {
        if (hours <= 3) {
            costs = hours * 2.00;
        }
        if (hours > 3) {
            costs = 6.00 + ((hours - 3) * 0.50);
        }
        if (costs > 10.00) {
            costs = 10.00;
        }
        System.out.printf("The charges for %d hours of parking is #%.2f.%n", hours, costs);
        return hours;
    }

}
