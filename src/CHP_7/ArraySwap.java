package CHP_7;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {

        int [] read = new int[] {1,5,7,8,9,0,3,4};
         swap(read,1,6);
        System.out.println(Arrays.toString(read));
replaceAll(read,1,9);
        System.out.println(Arrays.toString(read));
    }
    public static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
    public static void replaceAll(int[] list, int target, int
            replacement) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target) {
                list[i] = replacement;
            }
        }
    }
}
