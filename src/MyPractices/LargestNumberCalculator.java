package MyPractices;

public class LargestNumberCalculator {

    public int calculateLargest(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > z) {
            return y;
        } else {
            return z;
        }
    }
}
//    public int getLargestNumberCalculator(int x, int y, int z) {
//        if (x > y && x > z) {
//            return x;
//        }
//    }
//
//    public void setLargestNumberCalculator(int x, int y) {
//    }