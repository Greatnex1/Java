package MyPractices;

import java.util.Scanner;

public class InteractiveResponseSwitch {
    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Press 1 for English:");
        System.out.println("Press 2 for Igbo:");
        System.out.println("Press 3 for French:");
        System.out.println("Press 4 for Yoruba :");

        int english = input.nextInt();
        switch (english) {
            case 1:

                System.out.println("1  for  data");
                System.out.println("2 for transfer");

                int userInput = input.nextInt();
                switch (userInput) {
                    case 1:
                        System.out.println(" data");
                        break;
                    case 2:
                        System.out.println("transfer");
                }
                break;
                            case 2:
                                System.out.println("1. for Sharing");
                                System.out.println("2 for Caring");
                                int usInput = input.nextInt();
                                switch (usInput) {
                                    case 1:
                                        System.out.println("1.  Sharing");
                                        break;
                                    case 2:
                                        System.out.println("2. Caring");

                                }
                                break;

                                    case 3:
                                        System.out.println("1  for  Egg");
                                        System.out.println("2 for Champagne");
                                        int useInput = input.nextInt();
                                        switch (useInput) {
                                            case 1:
                                                System.out.println("1. Egg");
                                                break;
                                            case 2:
                                                System.out.println("2. Champ");
                                        }
                                        break;
                                                    case 4:
                                                        System.out.println("1  for  Ewa");
                                                        System.out.println("2 for Rice");

                                                        int ulInput = input.nextInt();
                                                        switch (ulInput) {
                                                            case 1:
                                                                System.out.println("1.  Ewa");
                                                                break;
                                                            case 2:
                                                                System.out.println("2. Rice");

                                                        }
                                                        break;

                                                }
                                        }
                                }









