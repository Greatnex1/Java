package CHP_6;

import java.util.Scanner;

public class Sum_Digits {
    public static void main(String... args) {
        Scanner white = new Scanner(System.in);
        int a;
        int sum = 0;
        System.out.println("Enter any four digit number:");
        SumOfDigits number = new SumOfDigits();
        a = white.nextInt();
        sum += a;
        String strong = number.plus(a);




//        while(a>0){
//            b = a % 10;
//            sum = sum + b;
//            a = a/10;
//        }
//        System.out.println("The sum of Digit is : " + sum);
  }
}
