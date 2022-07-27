package OOP.Inheritance;
//Inheritance is a programming technique that allows a derived class to extend the functionality of a base class, inheriting all states and behaviour.
//the subclass extends the super class
// a clas can be extended by many subclasses
public class Secretary extends  Employee{
    public void takeDictation(String text){
        System.out.println("Dictating texts:" + text);
    }
}
