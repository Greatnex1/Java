package CHP_6;

import java.util.Scanner;

public class SumOfDigits {

    static int sum(int digit){
        int result =0;

        while(digit > 0){
            result = digit % 0;
            digit/=10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner suno = new Scanner(System.in);
        System.out.println("Enter any four digit number");
        int number = suno.nextInt();
        System.out.println(number);
        System.out.println("The sum of digit is : " + sum(number));
    }
}
