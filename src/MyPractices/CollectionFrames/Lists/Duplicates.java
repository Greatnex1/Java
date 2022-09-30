package MyPractices.CollectionFrames.Lists;

import java.util.LinkedList;
import java.util.List;

public class Duplicates {
    public static void main(String[] args) {
        LinkedList <Integer> number = new LinkedList<>(
                List.of(1,1,1,3,3,3,5,5,5,7,7)
        );

       // System.out.println(number);

        for (int i = 1; i < number.size() ; i++) {
               number.add(i);
        }

    }

}
