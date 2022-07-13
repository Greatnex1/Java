package CHP_7;

import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) {
        int[] lst = new int[]{56, 41, 42, 46, 43, 33, 4, 30, 3, 3, 3, 3};
//        System.out.println(Arrays.toString(lst));
        int number = count(lst, 41);
        System.out.println(number);

        int search =find(lst,0);
        System.out.println(search);
    }

    //    to find how many times a value appears in a list
    public static int count(int[] list, int target) {
        int count = 0;
        for (int n : list) {
            if (n == target) {
                count++;
            }
        }
        return count;
    }

    //    when a value of a list is not found
    public static int indexOf(int[] list, int target) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target) {
                return i;
            }
        }
        return -1;

    }
    public static int find(int[] list, int target){
        //    to find where a value is in a list

        for (int i = 0; i < list.length; i++) {
            if (list[i] == target) {
                return i;
            }
        }
//        when a value is not in an array return -1;
        return -1;
    }

}