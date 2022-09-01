package CHP_7;

import MyPractices.Print;

public class Recur {
    public  static  void main(String[] args) {
        Print(2);
        System.out.println();
        factorial(2);
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
}
