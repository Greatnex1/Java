package MyPractices.CollectionFrames.Maps;

import java.util.*;

public class SecurityNumber {
    public static void main(String[] args) {

        Map<Integer, String> ssnMap = new TreeMap<>();
        ssnMap.put(222345111,"Olamide");
        ssnMap.put(223451121,"Noah");
        ssnMap.put(222345112,"Joshua");
        ssnMap.put(222345115,"Willie");
        ssnMap.put(222345118,"Jide");

        // prints out only the security number of each value

        Set<Integer> ssnSet = ssnMap.keySet();
        for (int numbers: ssnSet
             ) {
            System.out.println("SSN : " + numbers);

        }
        // print out the key and value
        System.out.println();
        for (int numbers: ssnMap.keySet()
        ) {
            String name = ssnMap.get(numbers);
            System.out.println(name + "'s "+ "Social Security Number  is : " + numbers);
        }
        // prints out name of each value
        Collection<String> names = ssnMap.values();
        System.out.println();
        for (String name : names
             ) {

            System.out.println("name :" + name);

        }
    }
}
