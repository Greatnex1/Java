package CHP_7;

public class Cards {
      private  final String face;
      private final  String suit;


    public Cards(String Sface, String Csuit) {
        this.face = Sface;
        this.suit = Csuit;

        }
    public String toString(){
        return face + " of " + suit;

    }
}

