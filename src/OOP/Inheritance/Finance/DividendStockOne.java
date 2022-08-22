package OOP.Inheritance.Finance;

public class DividendStockOne extends StockOne{
private  double dividends;

    public DividendStockOne(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        dividends = 0.0;
    }


    @Override
    public double getMarketValue() {
        return super.getMarketValue() + dividends;
    }

    public  void payDividend(double amountPerShare){
        dividends += amountPerShare * getTotalShare();

    }
}


