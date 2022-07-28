package OOP.Polymorphism;

import OOP.Inheritance.Employee;
import OOP.Inheritance.Lawyer;
import OOP.Inheritance.LegalSecretaries;
import OOP.Inheritance.Secretary;

public class EmployeePolyArray {
    public static void main(String[] args) {
        Employee [] employees = {new Employee(), new Lawyer(), new Secretary(), new LegalSecretaries()};

        for(Employee employ: employees){
            System.out.println(employ.getHours() + ",");
            System.out.printf("$%.2f,",  employ.getSalary());
            System.out.println(employ.getVacationForm());
            System.out.println(employees);
        }
    }
}
