package OOP.Inheritance.Tickets;

public class Ticket {
    private int number;
    private double price;

    public Ticket(int number, double price) {
        this.price = price;
        this.number = number;
    }
    public  double getPrice(){
        return price;
    }
//    public String toString(){
//        return
    public String toString() {
        return
                "Number" + number +
                ", Price=" + price
                ;
    }
}
