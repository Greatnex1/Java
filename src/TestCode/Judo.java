package TestCode;

import java.util.Scanner;

class Judo {

    public static void main(String... good) {

        Scanner input = new Scanner(System.in);

        System.out.print("Just one attempt ") ;
        System.out.println("Guess a number between  1 - 12:");
        int userInput = input.nextInt();


        if (userInput == 5 )
            System.out.println("Correct");


        if (userInput < 5 )
            System.out.println("Too low");

        if (userInput >= 10)
            System.out.println("Too High");

        if (userInput > 13)
            System.out.println("Get lost!!!");




    }

}