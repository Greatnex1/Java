package MyPractices;

import java.util.Scanner;

public class Bets {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int money = 50000;
        System.out.println("You have $" + money + "");
        if (money < 500) {
            System.out.print("Cash is dangerously low. Bet carefully." );
        } else if (money < 1000) {
            System.out.print("Cash is somewhat low. Bet moderately." );
        } else {
            System.out.print("Cash is in good shape. Bet liberally." );
        }
        System.out.print("\n How much do you want to bet? " );
        int bet = console.nextInt();
        System.out.println( "$ "+ bet + " bet is placed successfully ");
        int deduction = money - bet;
        System.out.println("you have $ " + deduction + " left");

    }
}
