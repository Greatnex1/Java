package OOP.Inheritance.Employee;

public class LegalSecretaries extends Employee{
    @Override
    public double getSalary() {
        return 45000.0;
    }
    public void fileLegalBriefs(){
        System.out.println("I can file all day");

    }
}
