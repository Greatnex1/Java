package OOP.Inheritance.Employee;

import OOP.Inheritance.Employee.Employee;
//Inheritance is a programming technique that allows a derived class to extend the functionality of a base class, inheriting all states and behaviour.
//the subclass extends the super class
// a clas can be extended by many subclasses

//super is a keyword used for calling methods and constructor of a superclass
public class Accountant extends Employee {
    public double getSalary() {
        return super.getSalary() + 25000;
    }
    public void records(){
        System.out.println("I keep all financial records");
}
}