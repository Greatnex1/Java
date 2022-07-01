package MyPractices;

import java.util.Scanner;

class Comment {
     public static void main(String...omit) {

        System.out.print("Wwlcome\nback\n to\n java\n") ;
         System.out.println("Wwlcome\tback\tto\tjava\t") ;
         System.out.println("\" This is a quote \"") ;


     }


    static class Print {
        public static void main(String...alright) {

            Scanner input = new Scanner(System.in) ;

            System.out.print("Enter first Number :");
            int firstNumber = input.nextInt();

            System.out.print("Enter second Number :");
            int secondNumber= input.nextInt();

            int difference = firstNumber - secondNumber ;

            System.out.printf(" Difference is %d%n", difference) ;

        }



    }
}