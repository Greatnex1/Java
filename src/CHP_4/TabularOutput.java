package CHP_4;

public class TabularOutput {
    public static void main(String[] args) {
        int square = 1;
        int cube = 1;
        int quad = 1;
        System.out.printf("%2s%8s%11s%12s%n", "N", "N^2", "N^3", "N^4");
        for (int multiple = 1; multiple <= 10; multiple ++) {

                square *=2;
               cube *=3;
               quad*= 4;
                System.out.printf("%2d%7d%10d%12d%n", multiple, square, cube, quad);
            }
        }
    }



