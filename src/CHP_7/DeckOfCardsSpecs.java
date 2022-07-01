package CHP_7;

public class DeckOfCardsSpecs {
    public static void main(String[] args) {
        DeckOfCards myDecks = new DeckOfCards(); //creating an object of deck of cards

        myDecks.shuffle(); // calling method shuffle in classDeckOfCards

        for (int i = 0; i < 52; i++) {

//            System.out.printf("""
//                            %-19s
//                            """, myDecks.dealCard());


            System.out.printf("%-19s", myDecks.dealCard());

            if( i % 4 == 0 ){
                System.out.println();
            }

        }
    }
}
