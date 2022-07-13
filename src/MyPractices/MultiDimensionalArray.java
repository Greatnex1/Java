package MyPractices;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        double [][]grid = new double[3][5];
        grid [2][3] = (5.1);
        print(grid);
    }
    public static void print(double[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
