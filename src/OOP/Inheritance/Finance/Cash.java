package OOP.Inheritance.Finance;

public class Cash implements  Assets {
    private double amount;

    public Cash(double amount) {
        this.amount = amount;
    }

    @Override
    public double getMarketValue() {
        return  amount;
    }

    @Override
    public double getProfit() {
        return 0.0;
    }
public void setAmount (double amount){
        this.amount = amount;
}
}
