package CHP_6;

import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i =0;
        while(i<=10){
            System.out.println("Enter a number");
            Divisible dose = new Divisible();
            int x = scan.nextInt();
            boolean divide = dose.isDivisible(x);
            System.out.println("Divisible by 5 ?\n" + divide);
            i++;
        }



//boolean did = dose.isDivide();

//        System.out.println("Enter a number");
//        int b = scan.nextInt();
//            System.out.println("Divisible by 5 ?\n" + did);
//    }
    }
}