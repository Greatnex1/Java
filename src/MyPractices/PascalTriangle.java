package MyPractices;

public class PascalTriangle {
    public static void main(String[] args) {
         int[][] triangle = new int[5][];
         fillIn(triangle);
         print(triangle);

    }


    public static void fillIn(int[][] triangle) {

        for (int i = 0; i < triangle.length; i++) {
             triangle[i] = new int[i + 1];
             triangle[i][0] = 1;
             triangle[i][i] = 1;
             for (int j = 1; j < i; j++) {

                triangle[i][j] = triangle[i - 1][j - 1]+ triangle[i -1][j];

            }


        }
    }





    public static void print(int[][] triangle) {
        for (int[] ints : triangle) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();

        }


    }
}

