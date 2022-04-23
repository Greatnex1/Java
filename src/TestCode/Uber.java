package TestCode;

import java.util.Scanner;

class Uber {

    public static void main(String... good) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int userInput = input.nextInt();


        if (userInput == 1)
            System.out.println(" 0");
        if (userInput == 0)
            System.out.println("1");

        if (userInput == 7)
            System.out.print("Try Again");


    }


}

