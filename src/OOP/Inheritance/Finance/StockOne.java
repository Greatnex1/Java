package OOP.Inheritance.Finance;



public class StockOne extends ShareAssets{
    private int totalShare;
    public StockOne(String symbol,  double currentPrice) {
        super(symbol, currentPrice);
        totalShare = 0;
    }

    @Override
    public double getMarketValue() {
        return totalShare * getCurrentPrice();
    }

    public double getTotalShare(){
        return totalShare;
    }
    @Override
    public double getProfit() {
        return getMarketValue() - getTotalCost();
    }
    public void purchase(int share, double pricePerShare){
        totalShare += share;

        addCost(share * pricePerShare);

    }
}
