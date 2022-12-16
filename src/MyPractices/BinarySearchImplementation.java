package MyPractices;

import CHP_7.Array;

import java.util.Arrays;

public class BinarySearchImplementation {
    //using recursive method


    //returns index of x if element is present in arr[l..r]
    //else returns -1;
    int binarySearchy(int[] arr, int l, int r, int x)
    {

        if( r >= l) {
            int mid = l + (r-l)/2;

            if(arr[mid]==x)
                return mid;

            if (arr[mid] > x)
                return binarySearchy(arr,l, mid -1, x);

            return binarySearchy(arr, l, mid + x, x);

        }
        return -1;

    }


    public static void main(String[] args) {
        BinarySearchImplementation search = new BinarySearchImplementation();
        int[] number = {23,45,1,0,89,3,8,90,190};
        System.out.println(Arrays.toString(number));
        Arrays.sort(number);
        int length = number.length ;
        int itemToSearch = 45;
        int result = search.binarySearchy(number,0,length-1, itemToSearch);
        if (result == -1)
            System.out.println("Element not Present");
        else
            System.out.println("Element you search for is at index " + result);
    }
}
