package CHP_2;

import java.util.Scanner;

public class Bmi {
    public static void main(String... ok) {

         double weightInPounds ;
         double heightInMetres ;
         double weightInKilogram ;
         double heightInInches ;


        Scanner bodyMassIndex = new Scanner(System.in);

        System.out.print("Enter Weight In Pounds: ");
         weightInPounds = bodyMassIndex.nextDouble();


        System.out.print("Enter Height in Meters: ");
        heightInInches= bodyMassIndex.nextDouble();

        weightInKilogram = weightInPounds * 45359237 ;
        heightInMetres = heightInInches * 0.0254 ;
        double Bmi = weightInKilogram / (heightInMetres * heightInMetres);
        System.out.printf("BMI is %f%n", Bmi) ;

        



    }

    public static class DrivingCost {
        public static void main(String... ok) {

            Scanner InputValues = new Scanner(System.in);

            System.out.print("Enter Driving Distance: ");
            InputValues.nextInt();

            System.out.print("Enter Miles Per Gallon: ");
              InputValues.nextInt();

            System.out.print("Enter Price Per Gallon: ");
             InputValues.nextInt();


            System.out.print(" The cost of driving is ");
              InputValues.nextInt();


        }

    }
}