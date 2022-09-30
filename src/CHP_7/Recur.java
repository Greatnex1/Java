package CHP_7;

import MyPractices.Print;

import java.io.File;
import java.util.Scanner;

public class Recur {
    public  static  void main(String[] args) {
        Print(2);
        System.out.println();
        factorial(3);
        System.out.println();
        reverse(new Scanner(
                "this\nis\nyou\nso\nincomplete"));
        System.out.println();
        mystery(4);
    }

    public static void reverse(Scanner input) {
        if(input.hasNextLine()){
            String line = input.nextLine();
            reverse(input);
            System.out.println(line);
        }
    }


    public static int Print(int n){
        if(n==0){
            return 0;
        }
        else{
            System.out.println(n);
            return Print(n*n);
        }

    }
//    calculate factorial of a positive integer
    public static int factorial(int n) {
        if (n == 0) {
//            System.out.println(n);
            return n;

        } else
            System.out.println(n);
        return n * factorial(n - 1);
    }
            public static void mystery(int n ){
                if(n<=1){
                  //  System.out.println(n);
                }
                else{
                    mystery(n/2);
                    System.out.println(" " + n);
        }

    }

}
