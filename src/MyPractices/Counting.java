package MyPractices;

import java.util.Scanner;

public class Counting {
    public static void main( String[] args ) {
        Scanner s = new Scanner(System.in);
        for (int i = 1; i < 2; i++) {
            for (int j = 1; j < 3; j++)
                System.out.print('*');
            System.out.println("\n#####");
        } // end outer for loop
    } // end main
}
