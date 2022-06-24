package MyPractices;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner yearWheels = new Scanner(System.in);

        System.out.println("Enter a Year >");

        int year = yearWheels.nextInt();

        leap(year);
    }

    public static boolean leap(int year){
        if(year % 4 == 0){
            System.out.println( year + " is a leap Year \n");

        }
        else{
            System.out.println( year + " Is not a leap year");
        }
        return false;
    }
}
