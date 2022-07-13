package MyPractices;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        System.out.println("Warning! The number entered doubles");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        int see = scan.nextInt();

        System.out.println(see*2);

    }
}
