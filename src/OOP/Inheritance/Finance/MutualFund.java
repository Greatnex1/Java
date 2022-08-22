package OOP.Inheritance.Finance;

public class MutualFund extends ShareAssets {
    private double totalShares;


    public MutualFund(String symbol,  double currentPrice) {
        super(symbol,  currentPrice);
        totalShares = 0.0;
    }

    @Override
    public double getMarketValue() {
        return totalShares * getCurrentPrice();
    }

    @Override
    public double getProfit() {
        return getMarketValue() - getTotalCost();
    }
    public void purchase(double share, double pricePerPurchase){
        totalShares += share;
        addCost(share * pricePerPurchase);

    }
}
