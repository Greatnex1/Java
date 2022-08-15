package CHP_7.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInitialization {
//    a program that reads the days of the week using an arraylist

    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>(
                List.of("Monday","Tuesday","Wednesday", "Thursday", "Friday"));
        System.out.println(days);

    }
}
