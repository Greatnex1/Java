package CHP_6;


import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {
            System.out.println(divisor(18));

// declaring object divisbile with dose;
//            Divisible dose = new Divisible();
//            int x = scan.nextInt();
//            dose.divide(x);
//            System.out.println("Divisible by 5 ?\n" + dose);

        }



    public static boolean divisor(int number) {
        System.out.println("Enter a number");
//        Scanner scan = new Scanner(System.in);
//        int i = 0;
//        while (i <= 5) {
//            System.out.println("Enter a number");
////            divide(false);
//            i++;
//        }

            if (number % 5 == 0) {
                return true;
            }
            else {

                return false;
            }

        }

    }





//boolean did = dose.isDivide();

//        System.out.println("Enter a number");
//        int b = scan.nextInt();
//            System.out.println("Divisible by 5 ?\n" + did);
//    }






