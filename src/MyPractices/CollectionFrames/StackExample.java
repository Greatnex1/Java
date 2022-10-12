package MyPractices.CollectionFrames;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        String[] string = {"orange","apple","bottle","wine"};
        Stack <String>  item= new Stack<>();
        for (String b : string
             ) {
            item.push(b);
        }
        System.out.println("Stack items " + item);
        System.out.println("Stack size " +  item.size());
        System.out.println("PEEK = " + item.peek());
        System.out.println();
        while (!item.isEmpty()){
            System.out.println(item.pop() + " ");
        }

        System.out.println();
    }
}
