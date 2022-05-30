package CHP_6;

import java.util.Scanner;

public class Sum_Digits {
    public static void main(String... args) {
        int a, b , sum = 0;
        Scanner white = new Scanner(System.in);
        System.out.println("Enter any four digit number:");
        a = white.nextInt();
        while(a>0){
            b = a % 10;
            sum = sum + b;
            a = a/10;
        }
        System.out.println("The sum of Digit is : " + sum);
    }
}
