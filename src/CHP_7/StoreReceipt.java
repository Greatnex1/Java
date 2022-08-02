package CHP_7;

import java.util.Scanner;

public class StoreReceipt {
    static final double TSHIRT_PRICE = 16.1075;
    static final double CHIPS_PRICE = 1.5215;
    static final double COKE_PRICE = 2.99;


    static int numberOfShirts;
    static int numberOfChips;
    static int numberOfCoke;
    static double tshirtTotal= TSHIRT_PRICE * numberOfShirts;
    static double chipsTotal = CHIPS_PRICE * numberOfChips;
    static double cokeTotal= (COKE_PRICE + 1.20) *  numberOfCoke;
    static double finalTotal = tshirtTotal + chipsTotal + cokeTotal;
    {} private static Scanner input;

    public static void main(String[] args) {
        input =  new Scanner(System.in);
        System.out.println("What is your name?");
        String f = input.nextLine();
        System.out.println("Welcome to Will Market" + f + "! We have the following item for sale :");
        System.out.println("T-shirt $18.95 15% off ");
        System.out.println("Coke $2.99");
        System.out.println("How many t-shirt do you want?");
        String numberOfShirts = input.nextLine();
        System.out.println("How many bags of potato chips?");
        String numberOfChips = input.nextLine();
        System.out.println(" What about 12-pack Coke?");
        String numberOfCoke = input.nextLine();
        tshirtTotal = tshirtTotal * .85;
        chipsTotal = chipsTotal * .85;
        tshirtTotal = tshirtTotal * 1.06;
        System.out.println("Your total is" + finalTotal);
        System.out.println("=======================================");
        System.out.println("====================================");


    }

}

