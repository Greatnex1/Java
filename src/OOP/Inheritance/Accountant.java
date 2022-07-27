package OOP.Inheritance;
//super is a keyword used for calling methods and constructor of a superclass
public class Accountant extends  Employee{
    public double getSalary() {
        return super.getSalary() + 25000;
    }
    public void records(){
        System.out.println("I keep all financial records");
}
}