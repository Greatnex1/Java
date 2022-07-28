package OOP.Polymorphism;

import OOP.Inheritance.*;

public class EmployeePoly {
/*   The ability of a client code to be used with different types of object and
    for it to behave differently depending on the actual object used is known as Polymorphism
the ability of variables to refer to subclass objects makes it possible to write flexible codes
that can interact with many types of objects in the same way.
Importantly a code will behave differently depending on what type of object is used because
some methods in the superclass as been overridden hence, changing the behaviour of such method
 Polymorphism is also called dynamic dispatch, virtual binding or late binding
 */
public static void main(String[] args) {
    Employee mvp = new Employee();
    Accountant ayo = new Accountant();
    Lawyer wiz = new Lawyer();

    print(mvp);
    print(ayo);
    print(wiz);
}

    public static void print(Employee e) {
        System.out.print(e.getHours() + ", ");
        System.out.println(e.getVacationForm() + " ," );
        System.out.println(e.getVacationForm() + " , ");
        System.out.println(e);
    }
}