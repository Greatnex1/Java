package MyPractices;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuess {
    // Two-digit number-guessing game with hinting.
        public static void main(String[] args) {
            System.out.println("""
                    Try to guess my two-digit
                    number, and I'll tell you how
                    many digits from your guess
                    appear in my number.
                    
                    """);

            System.out.println();


            Scanner console = new Scanner(System.in);

            // pick a random number from 0 to 99 inclusive
            Random rand = new Random();
            int number = rand.nextInt(100);

            // get first guess
            System.out.println("Guess a number within a range of 1 - 100\n");
            System.out.print("Your guess? ");
            getGuess(console);
             int guess = console.nextInt();
            int numGuesses = 1;

            // give hints until correct guess is reached
            while (guess != number) {
                int numMatches = matches(number, guess);
                System.out.println("Incorrect (hint: " + numMatches + " digits match)");
                System.out.println();
                System.out.print("Your guess? ");
                guess = console.nextInt();
                numGuesses++;

            }

            System.out.println("You got it right in " + numGuesses + " tries.");

        }

               //  returns how many digits from the given
         // guess match digits from the given correct number
         public static int matches(int number, int guess) {

            int numMatches = 0;

            if (guess / 10 == number / 10 || guess / 10 == number % 10) {
                numMatches++;


            }
            if (guess / 10 != guess % 10 && (guess % 10 == number / 10 || guess % 10 == number % 10)) {

                numMatches++;

            }


            return numMatches;
        }
    public static int getGuess(Scanner console) {
        int guess = getInt(console, "Your guess? ");
        while (guess < 0 || guess >= 100) {
            System.out.println("Out of range; try again.");
            guess = getInt(console, "Your guess? ");

        }
        return guess;

    }
        public static int getInt(Scanner console, String prompt){
             System.out.print(prompt);
              while (!console.hasNextInt()) {
                  console.next(); // to discard the input
            System.out.println("Not an integer; try again.");

                    System.out.print(prompt);
              }
             return console.nextInt();

        }
         }


