package CHP_6;

import java.util.Scanner;

public class Hypotenuse {
    
        public static void main(String[] args){
        
            Scanner input = new Scanner(System.in);
            double side1;
            double side2;
            double hyp;

            System.out.print("Enter a value for Side 1: ");
            side1 = input.nextDouble();
            System.out.print("Enter a value for Side 2: ");
            side2 = input.nextDouble();
            hyp =hypCal(side1,side2);
            System.out.println("The length of the hypotenuse is: " + hyp);
        }

    private static double hypCal(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}
