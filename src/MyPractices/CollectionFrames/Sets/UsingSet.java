package MyPractices.CollectionFrames.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UsingSet {
    //hashSet doesn't allow the arrangement of items sequentially
    //linkedHashSet allows the arrangement of items sequentially
    // a tree set is slower than hashSet
    public static void main(String[] args) {

        Set<String> storage = new TreeSet<>();
        storage.add("Lamp");
        storage.add("Bulb");
        storage.add("Lamp");
        storage.add("Book");
        storage.add("Laptop");
        storage.add("Bottle");
        System.out.println(storage);
    }
}
