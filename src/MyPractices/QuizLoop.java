package MyPractices;

import java.util.Scanner;

public class QuizLoop {
    /*pseudocode
    1. Generate two random single-digit integers
    2. if  number1 is less than number2, swap number 1 with number2
    3. prompt the student to answer " What is number 1 - number 2"
    4.Grade the answer and display the result
    */
    public static void main(String[] args) {
        final  int number_of_Questions = 5;
        int correctAnswer = 0;
        int count = 0;
        long startTIme = System.currentTimeMillis();
        String output = " ";
        Scanner input = new Scanner(System.in);

        while ( count < number_of_Questions) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;

            }
            System.out.print("What is " + number1 + "-" + number2 + "?");
            int answer = input.nextInt();

            if (number1 - number2 == answer) {
                System.out.println("You are correct!");
                correctAnswer++;
            } else
                System.out.println("Your answer is wrong\n" + number1 + " - " + number2 + "should be " + (number1 - number2));
            count++;
            output += "\n" + number1 + number2 + "=" + answer + ((number1 - number2 == answer) ? "correct" : " wrong");
        }
          long endTIme = System.currentTimeMillis() ;
          long testTIme = endTIme - startTIme;
            System.out.println("Correct count is" + correctAnswer + "\n time is" + testTIme/1000 + "seconds\n" + output);
        }
    }

