package MyPractices;

import java.security.SecureRandom;
import java.util.Scanner;

public class Randoms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom randomNumbers = new SecureRandom();
        SecureRandom secureRandom = new SecureRandom();
        System.out.println("How many questions do you want?");
        int cResponse = input.nextInt();
        int counter = 0;
        int correctAnswer = 0;
        int wrong = 0;
        int userAnswer;

        while(counter != cResponse){
            int firstNumber =   randomNumbers.nextInt(10);
            int secondNumber = randomNumbers.nextInt(10);
            int question = secureRandom.nextInt(1);
            switch (question) {
                case 0 -> {
                    System.out.println("What is " + firstNumber + " + " + secondNumber + " ? ");
                    userAnswer = input.nextInt();
                    if (firstNumber + secondNumber == userAnswer) {
                        correctAnswer++;
                    } else {
                        wrong++;

                    }
                }
//                case 1:
//                    System.out.println("What is " + firstNumber + " - " + secondNumber + " ? ");
//                    userAnswer = input.nextInt();
//                    if(firstNumber - secondNumber == userAnswer ){
//                        correctAnswer++;
//                    }
//                    else{
//                        wrong++;
//                    }

            }

              counter++;

        }
        int checkAnswer = correctAnswer - wrong;
        System.out.println("correctAnswer:"+ correctAnswer);
        System.out.println("wrongAnswer:"+ wrong);
        System.out.printf("Your score is %d%n", checkAnswer);

    }
}
