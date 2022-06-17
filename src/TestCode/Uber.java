package TestCode;

import java.util.Scanner;

public class Uber {

    private static int returnedNum;
    private  static String returnedValue;
    public static void main(String... good) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int userInput = input.nextInt();
        setUserInput(userInput);


//        if (userInput == 1)
//            System.out.println(" 0");
//        if (userInput == 0)
//            System.out.println("1");

        if (userInput == 7)
            System.out.print("Try Again");


    }


    public static void setUserInput(int number) {
        if (number == 1) {
            System.out.println("0");
            returnedNum = 0;
        }
        if (number == 0) {
            System.out.println("1");
            returnedNum = 1;
        }
    }

    public  int getUserInput() {
        return  returnedNum;
    }

    public void setUserInputTwo(int val) {
        if ( val == 7){
            System.out.println("7");
            returnedValue = "Try Again";
        }
    }
     public String getUserInputTwo(){
        return returnedValue;
     }


    }


