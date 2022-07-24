package MyPractices;

import java.util.Scanner;

public class Date_year_month_day_Main {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        Date_year_month_day date = new Date_year_month_day(2022,22, 7);
       System.out.println(date);

//        System.out.println("Enter a year");
//        int enter = scan.nextInt();
//        System.out.println("A Leap year?");
//        System.out.println(date.isALeapYear(enter));

       int year = date.getYear();
       boolean leap = date.isALeapYear();
        System.out.println(" is " + year  + " a leap year?");
       System.out.println(leap);
    }

}
