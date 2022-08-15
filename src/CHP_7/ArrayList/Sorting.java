package CHP_7.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
//    this program arranges/ sort objects alphabetically
public static void main(String[] args) {
    ArrayList <String> sorty = new ArrayList<>(
            List.of("orange", "apple", "water-melon", "kashew", "pear", "pine-apple", "mango"));
//            before sort
    System.out.println("List of fruits " + sorty);

//    after sorting
    Collections.sort(sorty);
    System.out.println("\nList of Fruit based on their alphabetical order " + sorty);
}
}
