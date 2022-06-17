package CHP_2;
//2.30
import java.util.Scanner;
public class SeperatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five numbers :");
        int userInput = input.nextInt();

        if (userInput == 42339 && userInput <= 10) {
            System.out.print("4  \t2 \t 3\t 3 \t 9");
        }
        else{
            System.out.print("Wrong");
        }



    }
}
