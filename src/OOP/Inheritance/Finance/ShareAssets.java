package OOP.Inheritance.Finance;
//An abstract class is a class that cannot be instantiated ( an object cannot be
//created from it or a client code having access to it) but serves as a superclass
// to hold common code and declare abstract behaviours.
//An abstract class is allowed to implement interfaces
//An abstract class can call any of it abstract methods even if they have no implementation in that class,
//because, an abstract class counts on its subclasses to implement the abstract methods.
// An abstract class can contain both abstract and non-abstract methods
//An abstract class can extend only one abstract class
public  abstract class ShareAssets implements Assets{
    private String symbol;
    private int totalShare;
    private  double totalCost;
    private double currentPrice;

    public ShareAssets(String symbol, double currentPrice) {
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        totalCost = 0.0;
    }
    public void addCost(double cost){
        totalCost += cost;
    }
    public double getCurrentPrice(){
        return  currentPrice;
    }
    public double getTotalCost(){
        return totalCost;
    }

    public void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }
    public abstract double getMarketValue();
    public double getProfit(){
        return getMarketValue() - getTotalCost() ;

    }
}


