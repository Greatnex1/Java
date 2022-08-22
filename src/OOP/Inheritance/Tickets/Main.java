package OOP.Inheritance.Tickets;


public class Main {
    public static void main(String[] args) {
        WalkupTicket walk = new WalkupTicket(15, 40);

        System.out.println(walk);
        System.out.println("Price of Walk ticket is $" + walk.getPrice());

    }




}