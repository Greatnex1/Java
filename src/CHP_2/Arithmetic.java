package CHP_2;
//2.15
import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
         int firstNumber;
         int secondNumber;
        Scanner input = new Scanner(System.in);

        System.out.print(" Enter first integers :");

         firstNumber = input.nextInt();

        System.out.print("Enter second integer:");
         secondNumber = input.nextInt();

          ArithmeticMethod cal = new ArithmeticMethod();
          int square = cal.calculateArithmetic(firstNumber);
           ArithmeticMethod cal1 = new ArithmeticMethod();
          int square1 = cal1.calculateArithmeticSecond(secondNumber);
           ArithmeticMethod calsum = new ArithmeticMethod();
        int sum = calsum.calculateArithmeticSum(firstNumber,secondNumber);
        ArithmeticMethod caldifference = new ArithmeticMethod();
        int difference = caldifference.calculateArithmeticDifference(firstNumber,secondNumber);

        System.out.printf(" Square of first integer is %d",square);
        System.out.printf("%n Square of second integer %d", square1);
        System.out.printf("%n Sum of Square is %d", sum);
        System.out.printf(" %n Difference of Square is %d", difference);




    }
}
