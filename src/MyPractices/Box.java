package MyPractices;

public class Box {
    public static void main(String[] args) {
        drawBox(5, 10);
    }

    public static void drawBox(int height, int width) {
// draw top of box
        writeChars('*', width);
        System.out.println("*");
//        for (int i = 1; i <= height - 2; i++) {
//            System.out.print('*');
//            writeChars(' ', width - 2);
//            System.out.println("*");
//      }

//            draw line of box
//        writeChars('*', -2);
//        System.out.println("*");
        for (int j = 1; j <= height - 2; j++) {
            System.out.print('*');
           writeChars(' ', width - 2);
           System.out.println("*");
    }
//                draw bottom of box
            writeChars('*', width);
            System.out.println('*');

        }







    private static void writeChars(char ch, int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(ch);
        }


    }

}