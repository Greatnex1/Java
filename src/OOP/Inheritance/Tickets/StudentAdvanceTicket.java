package OOP.Inheritance.Tickets;

public class StudentAdvanceTicket extends  AdvanceTicket{
    int days;
    int cost;
    public StudentAdvanceTicket(int number, double price) {
        super(number, price);
    }
    @Override
    public double getPrice(){
        if (days <= 10) {
            cost = 15;
        }

        else
            cost = 10;
         return cost;
    }
}
