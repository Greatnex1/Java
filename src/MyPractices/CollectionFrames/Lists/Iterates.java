package MyPractices.CollectionFrames.Lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iterates {
    public static void main(String[] args) {
       LinkedList <String> items = new LinkedList<>(
               List.of(
                       "Shoe", "Bag","Socks"
               )
       );
items.remove("Bag");
        System.out.println(items);
    }

    public static void longest(LinkedList<String>list) {
        Iterator <String> itr = list.iterator();
        String  longest =itr.next();
        while (itr.hasNext()){
            if(itr.next().length()>longest.length()){
                longest = itr.next();
            }
        }
       // return longest;

    }
}
