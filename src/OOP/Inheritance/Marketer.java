package OOP.Inheritance;

public class Marketer extends Employee{
    @Override
    public double getSalary() {
        return 5000.0;
    }
    public void advertise(){
        System.out.println("Buy two get one free of A&B lotion cream");
    }
}
