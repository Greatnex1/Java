package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxItem {
    public static void main(String[] args) {
        Integer arr [] = {1,2,3,4,10,11};
        int sum = 0;
        int max = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum +=arr[i];
            if(arr[i] > max){
                max = arr[i];

            }
        }

        System.out.println("Sum = " + sum);
        System.out.println("Maximum value = " + max);

        //using Arraylist
        int numbers [] = {3,5,7,154,190,122};
        List <Integer> maxValue = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            maxValue.add(numbers[i]);
        }
        System.out.println("Largest value = "+ Collections.max(maxValue));
    }
}
