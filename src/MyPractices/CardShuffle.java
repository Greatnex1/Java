package MyPractices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// a program that shuffles a card
public class CardShuffle {
    public static void main(String[] args) {
        String [] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String [] shapes ={"Clubs","Diamond", "Hearts","Spade"};

        List <String> deck = new ArrayList<>();
        for(String item : shapes){
            for (String post:ranks
                 ) {
                deck.add(item + " of "+ post);
            }

        }
        Collections.shuffle(deck);
        System.out.println("Top card = "+deck.get(0));

    }
}
