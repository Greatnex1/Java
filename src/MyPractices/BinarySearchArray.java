package MyPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//a program that searches through items in an array and arraylist using binary search
// to use a binary search tree items in the array or list must be in sorted order
public class BinarySearchArray {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>(
                List.of(1,3,6,7,22,45,29)

        );
        int index = Collections.binarySearch(numbers,29);
        System.out.println("35 is found at index " + index);
        System.out.println();

        int [] array = {20,10,15,30,45,50};
        int items = Arrays.binarySearch(array,30);
        System.out.println("30 is found at index "+ items);
    }
}
