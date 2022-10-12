package MyPractices.CollectionFrames;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueExample {
    public static void main(String[] args) {
        String[] string = {"orange","apple","bottle","wine"};
        Queue <String> item= new LinkedList<>();
        for (String b : string) {
            item.add(b);
        }
        System.out.println("queue list =  " + item);
        System.out.println("Stack size " +  item.size());
        System.out.println("PEEK = " + item.peek());
        System.out.println();
        while (!item.isEmpty()){
            System.out.println(item.remove() + " ");
        }
        System.out.println();
    }
}
