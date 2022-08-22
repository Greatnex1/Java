package MyPractices;

import java.util.ArrayList;

public class TildeFun {
    public static void main(String[] args) {
        ArrayList <String> words = new ArrayList<>();
        words.add("four");
        words.add("score");
        words.add("and");
        words.add("seven");
        words.add("years");
        words.add("ago");
        System.out.println("\n a statement " + words);

        for (int i = words.size() -1; i>= 0; i--) {
            words.add(i, "~");
            System.out.println("After loop statement" + words);

        }
        System.out.println();
//            remove tildes
            for (int i = words.size() - 1; i>=0; i-=2 ) {
                words.remove(i);
                System.out.println("After second loop statement" + words);


            }

        }


    }

