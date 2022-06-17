package CHP_5;
import java.util.*;
public class Symbol_Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter your name : ");
            scan.next();


            for (int m = 1; m <= 5; m++) {
                for (int j = 1; j <= 3; j++) {
                    for (int k = 1; k <= 4; k++) {
                        System.out.print('*');
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }

    }
}