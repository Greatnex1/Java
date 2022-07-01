package CHP_4;

import java.util.Scanner;

public class Palin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five digit number");
        int userInput = input.nextInt();
        int firstNumber = userInput/1000;
        int firstDigit = userInput %1000;
        int secondNumber = firstDigit/100;
        int secondDigit = firstDigit%100;
        int thirdNumber = secondDigit/100;
        int thirdDigit = secondDigit%100;
        int fourthNumber = thirdDigit/10;
        int fifthNumber = thirdDigit%10;

        if(firstNumber == fifthNumber && secondNumber == fourthNumber){
            System.out.println("This is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }
}



