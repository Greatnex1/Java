package MyPractices;



public class GreatestCommonDivisor {
    public static void main(String[] args) {
        commonDivisor(132, 5);
    }

    public static int commonDivisor(int x, int y) {
        if (x < 0 || y < 0) {
            System.out.println("x = " + x + " and y = " + y);
            return commonDivisor(Math.abs(x), Math.abs(y));
        }

         else  if
            (y == 0) {
              return x;}

        else {
            System.out.println("x = " + x + " and y = " + y);
            return commonDivisor(x%y, x % y);

        }

        }
    }