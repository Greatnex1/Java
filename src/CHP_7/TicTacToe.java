package CHP_7;

import java.util.*;

import static CHP_7. TicTacToeMethod.*;
public class TicTacToe {
    private static String returnedPlay;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        board = new String[9];

        turn = "X";

        String winner = null;


        for (int t = 0; t < 9; t++) {

            board[t] = String.valueOf(t + 1);

        }


        System.out.println("\t\t\tWelcome to a 3x3 Tic - Tac - Toe!");

        printBoard();

        System.out.println(

                 "X goes first. Enter a slot number to place X in:");


        while (winner == null) {

            int numInput;

            // Exception handling.

            // numInput will take input from user like from 1 to 9.

            // If it is not in range from 1 to 9.

            // then it will show you an error "Invalid input."

            try {

                numInput = in.nextInt();

                if (!(numInput > 0 && numInput <= 9)) {

                    System.out.println(

                            "Invalid input; re-enter slot number:");

                    continue;

                }

            } catch (InputMismatchException e) {


                System.out.println(

                        "Invalid input; re-enter slot number:");

                break;

            }


            // This game has two player x and O.

            // Here is the logic to decide the turn.

            if (board[numInput - 1].equals(

                    String.valueOf(numInput))) {

                board[numInput - 1] = turn;


                if (turn.equals("X")) {

                    turn = "O";

                } else {

                    turn = "X";

                }


                printBoard();

                winner = checkWinner();

            } else {

                System.out.println(

                        "Slot already taken; re-enter slot number:");

            }

        }


        // If no one win or lose from both player x and O.

        // then here is the logic to print "draw".

        assert winner != null;
        if (winner.equalsIgnoreCase("draw")) {

            System.out.println(

                    "It's a draw! Thanks for playing.");

        }


        // For winner -to display Congratulations! message.

        else {

            System.out.println(

                    "Congratulations! " + winner  + "'s have won! Thanks for playing.");


        } // end boardFull method
//}
    }



    public void setCheckWinner() {
        returnedPlay = "XXX";
    }

    public String getCheckWinner() {


        return returnedPlay;

    }
}