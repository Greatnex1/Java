package OOP.Inheritance.Tickets;

public class AdvanceTicket extends WalkupTicket{
    int days;
    int cost;
    public AdvanceTicket(int number, double price) {
        super(number, price);
    }
    @Override
    public double getPrice(){
        if(days <= 10){
            cost = 30;
        }
        else
            cost = 40;
        return  cost;
    }

}
