package CHP_7.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSummation {
//    this program sum up all digits in arraylist

    public static void main(String[] args) {
        ArrayList <Integer> digits = new ArrayList<>(
                List.of(1,22,33,44,55,66,20,34));
        int sum = 0;
        for (int numbers : digits) {
            sum += numbers;

        }
        System.out.println(" list of numbers = "+ digits);
        System.out.println("sum = "+ sum);

        int product = digits.get(0) * digits.get(6);
        System.out.println(product);
    }
//    multiply items in index

}
