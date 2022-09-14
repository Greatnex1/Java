package CHP_7.ArrayList;

import java.util.ArrayList;

//import static com.sun.org.apache.bcel.internal.classfile.Utility.replace;


public class Replacement {
    public static void main(String[] args) {
        ArrayList <String> items = new ArrayList<>();
        items.add("book");
        items.add("laptop");
        items.add("phone");
        items.add("earpiece");
        items.add("notepad");
        System.out.println("These are list of items present in my bag " + items);
        replace(items,"book","novel");
        System.out.println("my latest items are "+ items);
/// or
        items.set(1,"television");
        System.out.println("Current item list "+ items);


    }

    private static void replace(ArrayList<String>items, String target , String replacement) {

        int index = items.indexOf(target);
        if(index >= 0){
            items.set(index, replacement);
        }
    }
    }