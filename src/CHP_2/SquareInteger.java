package CHP_2;

import java.util.Scanner;

public class SquareInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int square = scan.nextInt();
    int result =    doubleNumber(square);
        System.out.println(result);
    }
    private static int doubleNumber(int number){
       int answer =  number * number;
       if (answer > 100){
           System.out.println("the square of this number is greater than 100" );
       }
           return answer;
    }
}
