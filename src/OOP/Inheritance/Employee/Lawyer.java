package OOP.Inheritance.Employee;

public class Lawyer extends Employee{
    @Override
    public int getVacationDays(){
        return 15;

    }
    @Override
    public String getVacationForm(){
        return "Pink";

    }
    public void lawSuit(){
        System.out.println("I'll see you in court");
    }


    }
