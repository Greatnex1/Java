package CHP_7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListOne {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        //Add operation
        list.add("California");
        list.add("Alabama");
        list.add("Colorado");
        list.add("Delaware");
        list.add(4, "Texas"); //add based on index

        list.contains("Virginia"); //false

        list.remove("Colorado");
        list.remove(1); //remove by index
        // Creating an ArrayList of String
        List <String> states = new ArrayList<String> ();

        // Adding new elements to the ArrayList
        states.add("California");
        states.add("Alabama");
        states.add("Florida");
        states.add("Hawaii");
        states.add("New York");

        System.out.println(states);

        // Adding an element at a particular index in an ArrayList
        states.add(3, "Texas");

        System.out.println(states);

        //remove element By value.This will use equal internally
        list.remove("Colorado");
        list.remove(1); //remove by index

        //display output after remove operation
        System.out.println(list);

        //removing element by passing collection
        List < String > removeCollection = Arrays.asList("California", "Alabama");
        list.removeAll(removeCollection);

        //display output after remove operation
        System.out.println(list);
    }
}
