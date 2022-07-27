package OOP.Inheritance;

import MyPractices.Stock;

public class DividendStock extends Stock {
//super keyword can be used only when accessing overridden methods or constructors from a superclass
    private double dividends;
// a new dividend stock constructor
    public DividendStock(String theSymbol) {
        super(theSymbol);
        this.dividends = 0.0;
    }

    public DividendStock(int priceShare, double priceCost) {
        super(priceShare, priceCost);
    }
//   a new method

    @Override
    public double getProfit(double presentPrice) {
        return super.getProfit(presentPrice) + dividends;
    }

    public void payDividend(double amountPerShare){
    dividends += amountPerShare * getTotalShare();

    }
}
