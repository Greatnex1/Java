import java.util.Scanner;

public class Value {
    public static void main(String... ok) {

        Scanner InputValues = new Scanner(System.in);

        System.out.print("Enter Driving Distance: ");
       int drive = InputValues.nextInt();

        System.out.println();

        System.out.print("Enter Miles Per Gallon: ");
       int gallon = InputValues.nextInt();
        System.out.println();
        System.out.println( "The total distance covered is " + drive * gallon);

    }


}