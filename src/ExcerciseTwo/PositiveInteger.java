package ExcerciseTwo;
import java.util.Scanner;
public class PositiveInteger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any positive Integer :");
        int x = input.nextInt();
        if (x % 2 == 0) {
            System.out.print(" odd number!!!");
        } else {
            if (x % 2 == 1) {
                System.out.print("prime number");
            } else {
                System.out.print("Go study more");
            }
        }
    }
}
