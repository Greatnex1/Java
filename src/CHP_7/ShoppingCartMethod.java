package CHP_7;

public class ShoppingCartMethod {
    private String[] item;
    private int[] quantity;
    private double[] price;

    private double total;

    public ShoppingCartMethod() {
        item = new String[25];
        quantity = new int[20];
        price = new double[20];
    }

    public void addItem(String item, int index) {
        this.item[index] = item;

    }
    public void addQuantity(int quantity, int index) {
        this.quantity[index] = quantity;
    }

    public void addPrice(double price, int index) {
        this.price[index] = price;
    }

    public String getItem(int index){
        return item[index];
    }
public int getQuantity (int index){
        return quantity[index];
    }
    public double getPrice(int index) {
        return price [index];

    }
    public double total(int index){
        double total = quantity[index] * price[index];
        return total;
    }
    public int getAmountPaid(int amount){
        return amount;
    }
}



