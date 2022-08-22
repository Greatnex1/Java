package OOP.Inheritance.Tickets;

public class WalkupTicket extends Ticket{

    public WalkupTicket(int number, double price) {
        super(number, price);
    }
    @Override
    public double getPrice(){
        return 50.0;
    }
}
