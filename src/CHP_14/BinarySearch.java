package CHP_14;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,9,10};
        int target = 3;

        System.out.println("Found It "+binarySearch(arr, target));
    }

    public static int binarySearch(int[] array, int target){
        int start=0;
        int end= array.length;

        while (start <= end){
            int midPoint=(start+end)/2;

            if (array[midPoint]==target){
                return array[midPoint];
            } else if (array[midPoint]<target) {
                start=midPoint + 1;
            }
            else {
                end=midPoint;
            }
        }
        return -1;
    }

}
