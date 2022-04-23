package TestCode;
import java.util.Scanner;

class Addition {
    public static void main(String... ok) {

        Scanner InputValues = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        int firstNumber = InputValues.nextInt();

        System.out.print("Enter second Number: ");
        int secondNumber = InputValues.nextInt();


        int sum= firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int divide = firstNumber / secondNumber;



        System.out.printf("%d%n", sum);
        System.out.printf(" %d%n", substraction);
        System.out.printf(" %d%n", multiplication);
        System.out.printf("The division is %d%n", divide);
        System.out.printf("%d > %d%n", firstNumber,secondNumber) ;
    }


}

