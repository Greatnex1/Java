package CHP_2;
import java.util.Scanner;
public class PositiveInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any positive Integer :");
         input.nextInt();
PositiveIntegerMethod vibe = new PositiveIntegerMethod();
String win = vibe.calculatePositiveInteger(32);
        System.out.println(win);
    }
}
