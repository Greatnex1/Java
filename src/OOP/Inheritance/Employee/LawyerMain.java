package OOP.Inheritance.Employee;

public class LawyerMain {
    public static void main(String[] args) {
        Lawyer law = new Lawyer();

        System.out.println( " I go on vacation for " + law.getVacationDays() + " weeks" );
        law.lawSuit();
    }


}
