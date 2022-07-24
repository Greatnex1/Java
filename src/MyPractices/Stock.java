package MyPractices;

public class Stock {
    private String symbol;

    private int totalShare;

    private double totalCost;


    public Stock(String theSymbol) {
        if (theSymbol == null) {
            throw new NullPointerException();
        }

        symbol = theSymbol;
       totalShare = 0;
        totalCost = 0.0;


    }

    public double getProfit(double presentPrice) {
        if (presentPrice < 0.0) {
            throw new IllegalArgumentException();
        }
        return totalShare * presentPrice - totalCost;
//        to avoid reading of negative presentPrice, throw an Exception

    }

    public void purchase(int shares, double profit) {
        if (shares < 0 || profit < 0.0) {
            throw new IllegalArgumentException();
        }
        totalShare += shares;
        totalCost = shares * profit;
//        to make sure that negative numbers are not passed in throw an Exception



        }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", totalShare=" + totalShare +
                ", totalCost=" + totalCost +
                '}';
    }
    //    public void share(int purchase){
//        totalShare += purchase;
//    }
//    public void cost(double profit){
//        int purchase;
//        totalCost = purchase * profit
//    }
}
