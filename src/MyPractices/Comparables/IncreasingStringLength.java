package MyPractices.Comparables;

import java.util.Arrays;
import java.util.Collections;

// a program that represents item in order of increasing length
public class IncreasingStringLength {
    public static void main(String[] args) {
        String [] items = {"ax","ada","adam","esther","daniel","joy","CHINEDU","CHIEF"};
        Arrays.sort(items, new LengthComparator());
        System.out.println(Arrays.toString(items));
        //sorting in reverse order
        Arrays.sort(items, Collections.reverseOrder());
      //  System.out.println(Arrays.toString(items));
    }
}
