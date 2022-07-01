package CHP_7;

import java.security.SecureRandom;

public class DeckOfCards {
    private static  final SecureRandom randNumber = new SecureRandom();

    private static final int NUMBER_OF_CARDS = 52; // constant # of Cards
    private Cards[] deck = new Cards[NUMBER_OF_CARDS]; // Card references
    private int currentCard = 0; // index of next Card to be dealt (0-51)
    // constructor fills deck of Cards
    public DeckOfCards() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
// populate deck with Card objects
        for (int count = 0; count < deck.length; count++) {
            deck[count] =
                    new Cards(faces[count % 13], suits[count / 13]);
        }
    }
    // shuffle deck of Cards with one-pass algorithm
    public void shuffle() {
// next call to method dealCard should start at deck[0] again
        currentCard = 0;
// for each Card, pick another random Card (0-51) and swap them
        for (int first = 0; first < deck.length; first++) {
// select a random number between 0 and 51
            int second = randNumber.nextInt(NUMBER_OF_CARDS);
// swap current Card with randomly selected Card
            Cards temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }
    // deal one Card
    public Cards dealCard() {
// determine whether Cards remain to be dealt
        if ( currentCard < deck.length ) {
            return deck[currentCard++]; // return current Card in array
        }
        else {
            return null; // return null to indicate that all Cards were dealt
        }
    }
}
