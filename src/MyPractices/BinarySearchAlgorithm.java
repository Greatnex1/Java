package MyPractices;

public class BinarySearchAlgorithm {
    private static int binarySearch(int[] numbers, int target) {
        int min = 0;
        int max = numbers.length - 1;
        while (min <= max) {
            int mid = (max + min) / 2;

            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }
}