package HackerRank;

import java.util.Arrays;
import java.util.Collections;

public class ReversedArray {
    //using collections
    public static void main(String[] args) {
        Integer [] number = {1,2,3};
        reverse(number);

    }

    private static void reverse(Integer num[]) {
        Collections.reverse(Arrays.asList(num));
        System.out.println(Arrays.asList(num));

    }



}
