package OOP.Inheritance.Employee;

public class Marketer extends Employee{
    double extra = 10_0000;
    @Override
    public double getSalary() {
        return 5000.0 + extra;
    }
    public void advertise(){
        System.out.println("Buy two get one free of A&B lotion cream");
    }
}
