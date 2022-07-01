package tdd;

public class Drill {

    public int copy(int numberOfCopy, int amount) {
        if( numberOfCopy >=1  && numberOfCopy <= 5) {
            amount = numberOfCopy * 2000;}

        if( numberOfCopy >=6 && numberOfCopy <= 9) {
            amount = numberOfCopy * 1800;}

        if( numberOfCopy >=10 && numberOfCopy <= 29) {
            amount = numberOfCopy * 1800;}


        return amount;


    }
}
