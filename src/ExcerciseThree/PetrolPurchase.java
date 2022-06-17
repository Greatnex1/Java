package ExcerciseThree;

public class PetrolPurchase {
 private String location;
 private String petrol_type;
 private int quantity;
 private double price;
 private double percentage_discount;


    public PetrolPurchase(String location, String petrol_type, int quantity, double price, double percentage_discount) {
        this.location = location;
        this.petrol_type = petrol_type;
        this.quantity = quantity;
        this.price = price;
        this.percentage_discount = percentage_discount;
    }


        public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPetrol_type() {
        return petrol_type;
    }

    public void setPetrol_type(String petrol_type) {
        this.petrol_type = petrol_type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPercentage_discount() {
        return percentage_discount;
    }

    public void setPercentage_discount(double percentage_discount) {
        this.percentage_discount = percentage_discount;
    }

    public double getPurchaseAmount(){
       double net_amount = quantity * price-percentage_discount;

   return net_amount;
    }

    }

