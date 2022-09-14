package CHP_7.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class LoopingThroughItems {
    //a program that  loops through items and sum its length
    public static void main(String[] args) {
        ArrayList<String> bands = new ArrayList<>(
                List.of("West","Boys", "Honor",  "Pride"
                ));

        int sum=0;
        for (int i = 0; i < bands.size() ; i++) {
            String items = bands.get(i);
            sum += items.length();
        }
        System.out.println(bands);
        System.out.println("Total length is " + sum);
    }
}
