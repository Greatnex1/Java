package CHP_7;

import java.util.Arrays;

public class TicTacToeMethod {

    static String[] board;

    static String turn;

    static String checkWinner() {

        for (int check = 0; check < 8; check++) {

            String line = null;


            switch (check) {

                case 0 ->
                        line = board[0] + board[1] + board[2];


                case 1 ->

                        line = board[3] + board[4] + board[5];

                case 2 ->

                        line = board[6] + board[7] + board[8];


                case 3 ->

                        line = board[0] + board[3] + board[6];


                case 4 ->

                        line = board[1] + board[4] + board[7];


                case 5 ->

                        line = board[2] + board[5] + board[8];


                case 6 ->

                        line = board[0] + board[4] + board[8];


                case 7 ->

                        line = board[2] + board[4] + board[6];


            }

            if (line.equals("XXX")) {

                return "X";

            }

            else if (line.equals("OOO") ){

                return "O";

            }

        }


        for (int a = 0; a < 9; a++) {

            if (Arrays.asList(board).contains(

                    String.valueOf(a + 1))) {

                break;

            } else if (a == 8) {

                return "draw";

            }

        }


        // To enter the X Or O at the exact place on board.

        System.out.println(

                turn + "'s turn; enter a slot number to place "

                        + turn + " in:");

        return null;

    }


    // To print out the board.

    /* |---|---|---|

       | 1 | 2 | 3 |

       |-----------|

       | 4 | 5 | 6 |

       |-----------|

       | 7 | 8 | 9 |

       |---|---|---|*/


    static void printBoard() {

        System.out.println("|---|---|---|");

        System.out.println("| " + board[0] + " | "

                + board[1] + " | " + board[2]

                + " |");

        System.out.println("|-----------|");

        System.out.println("| " + board[3] + " | "

                + board[4] + " | " + board[5]

                + " |");

        System.out.println("|-----------|");

        System.out.println("| " + board[6] + " | "

                + board[7] + " | " + board[8]

                + " |");

        System.out.println("|---|---|---|");
        }



    }


