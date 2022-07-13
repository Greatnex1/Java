package CHP_5;

public class NestedLoops {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.println("Hi there.");
//            }
//        }
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 12; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
//        System.out.println();
//        for (int i = 1; i <= 6; i++) {
//            for (int j = 1; j <= 4; j++) {
//                System.out.print("*");
//            }
////            System.out.println();
//        }
        System.out.println();
        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j <= 5; j++) {

                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= 9; j++) {

                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j <= 5; j++) {
//                System.out.println();
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int line = 5; line >= 1; line--) {
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print(" ");


            }
            int stars = 2 * 5 + 1 - 2 * line;
            for (int i = 1; i <= stars; i++) {

                System.out.print("*");

            }

            System.out.println();
        }
        System.out.println();
        for (int line = 1; line <= 10; line++) {
            for (int j = 1; j <= (line - 1); j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= (11 - 2 * line); j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println();
        for (int line = 5; line >=1; line--) {
            for (int j = 1; j <= 1; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <=line; j++) {
                System.out.print(line);

            }
            System.out.println();
        }
    }
}
//        for (int line = 5; line >=1; line--) {
//            for (int i = 1; i <= (line −1); i++){
//                System.out.print(" ");
//            }
//            for (int i = 1; i <= (11 − 2 * line);i++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


