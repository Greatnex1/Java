package MyPractices;

import java.util.Scanner;

public class BodyMassIndexApp {
    public static void main(String[] args) {
        Intro();
        Scanner console = new Scanner(System.in);

        double bodyMass = getBMI(console);
        double bodyMassTwo = getBMI(console);
        reportResults(bodyMass,bodyMassTwo);
    }

    private static void Intro() {
        System.out.println("""
                This program reads dada from two people
                calculates their body mass index and weight status
                """);
        System.out.println();
    }

    public static double getBMI(Scanner console) {
        System.out.println("Enter next person's information:");
        System.out.print("height (in inches)? ");
        double height = console.nextDouble();
        System.out.print("weight (in pounds)? ");
        double weight = console.nextDouble();
        double bmi = weight / (height * height) * 703;
        System.out.println();
        return bmi;
    }

    public static double BMIFor(double height, double weight) {

        return weight / (height * height) * 703;
    }

    public static void reportResults(double bmi1, double bmi2) {
        System.out.printf("Person #1 body mass index = %5.2f\n", bmi1);
                reportStatus(bmi1);
        System.out.printf("Person #2 body mass index = %5.2f\n",bmi2);

                reportStatus(bmi2);

    }

         // reports the weight status for the given BMI value
         public static void reportStatus(double bmi) {
        if (bmi < 18.5) {

            System.out.println("underweight");

        } else if (bmi < 25) {

            System.out.println("normal");

        } else if (bmi < 30) {

            System.out.println("overweight");

        } else {

            System.out.println("obese");

        }


    }
}
