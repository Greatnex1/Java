package MyPractices;

public class IntegerSquare {
    public static void main(String[] args) {
//        square of first-five integer
        for (int i = 1; i <= 5; i++) {
            int squared = i * i;
            System.out.println(i + " squared = " + squared);
        }
        System.out.println();
//        cube of first five integers
        for (int i =1; i <= 5; i++) {
            int cube= i * i * i;
            System.out.println(i + " cube = " + cube);
        }
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("*");
            }
        }
    }
}
