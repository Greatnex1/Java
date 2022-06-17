package CHP_7;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTwo {
    public static void main(String[] args) {
        List< Integer > integerList = Arrays.asList(1, 2, 3, 6, 7, 4, 9, 11, 34, 12, 22);
        ListIterator< Integer > listIterator = integerList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("Next element is " + listIterator.next());
        }
        while (listIterator.hasPrevious()) {
            System.out.println("Previous element is " + listIterator.previous());
        }
    }
}
