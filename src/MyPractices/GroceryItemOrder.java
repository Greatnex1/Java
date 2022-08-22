package MyPractices;

public class GroceryItemOrder {
    private String nameOfItem;
    private int itemQuantity;
    private double pricePerUnit;

    public GroceryItemOrder(String nameOfItem, int itemQuantity, double pricePerUnit) {
        this.nameOfItem = nameOfItem;
        this.itemQuantity = itemQuantity;
        this.pricePerUnit = pricePerUnit;
    }
    public double getCost(){
        return pricePerUnit * itemQuantity;
    }
    public  void setItemQuantity(int quantity){
        this.itemQuantity = quantity;
    }

    @Override
    public String toString() {
        return "GroceryItemOrder{" +
                "nameOfItem='" + nameOfItem + '\'' +
                ", itemQuantity=" + itemQuantity +
                ", pricePerUnit=" + pricePerUnit +
                '}';
    }
}
