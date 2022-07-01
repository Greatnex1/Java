package CHP_4;

public class TabularOutput {
    public static void main(String[] args) {
        int numberOne = 1;
        int numberTwo = 2;
        int numberThree = 3;
        int numberFour = 4;
        int numberFive = 5;
        int mix = numberOne;
        System.out.printf("%2s%7s%8s%7s%n", "N", "N^2", "N^3", "N^4");
        for (int multiple = 1 ; multiple <= 5; ++multiple ) {

//            for (int i = 2; i <=6 ; i++) {
//                System.out.print(i);


                int multiply = numberOne * 2;
                int cube = numberOne * 3;
                int quad = numberOne * 4;
                System.out.printf("%2d%6d%8d%7d%n", multiple, multiply, cube, quad);
            }
        }

    }

