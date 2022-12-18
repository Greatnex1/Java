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

  void  sort ( int storage[]){

           int l = storage.length;

        for(int i = 0; i<l-1; i++){
            int minimum_index = i;
            for(int j = i +1; j < l; j++)
                if(storage[j]< storage[minimum_index] )
                    minimum_index = j;
            int temp = storage[minimum_index];
                storage[minimum_index] = storage[i];
                storage[i] = temp;
            }
        }


    void printArray(int display[]){
        int l = display.length;
        for(int i = 0; i < l; i++){
            System.out.println(display[i] + " ");

        }
        System.out.println();
    }


    public static void main(String[] args) {
        BinarySearchImplementation search = new BinarySearchImplementation();
        int[] number = {23,45,1,0,89,3,8,90,190};
        search.sort(number);
        search.printArray(number);
        int length = number.length ;
        int itemToSearch = 23;
        int result = search.binarySearchy(number,0,length-1, itemToSearch);
        if (result == -1)
            System.out.println("Element not Present");
        else
            System.out.println("Element you search for is at index " + result);
    }
}
