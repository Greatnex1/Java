package ExcerciseTwo;
//2.15
import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(" Enter first integers :");

        int firstNumber = input.nextInt();

        System.out.print("Enter second integer:");
        int secondNumber = input.nextInt();

        int square = (firstNumber * firstNumber);
        int square1 = (secondNumber * secondNumber);
        int sum = (firstNumber * firstNumber) + (secondNumber * secondNumber);
        int difference =  (firstNumber * firstNumber) - (secondNumber * secondNumber);

        System.out.printf(" Square of first integer %d", square);
        System.out.printf("%n Square of second integer %d", square1);
        System.out.printf("%n Sum of Square %d", sum);
        System.out.printf(" %n Difference of Square %d", difference);




    }
}
