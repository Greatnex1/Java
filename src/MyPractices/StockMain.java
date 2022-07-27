package MyPractices;

import java.util.Scanner;

public class StockMain {
    public static void main(String[] args) {
//        this program reads only two stocks
//        Stock reader = new Stock("Mico");

        Scanner scan = new Scanner(System.in);
        System.out.println("How many stocks do you have");
        int user = scan.nextInt();
//        int sentinel = 0;
//        while (sentinel != user) {
//        }

            System.out.print("Enter Stock Symbol:");
            String symbol = scan.next();
            Stock stock = new Stock(symbol);
            double profit = purchasePower(scan, stock);


            Scanner scan1 = new Scanner(System.in);
            System.out.print("Enter Stock Symbol 2:");
            String symbol1 = scan.next();
            Stock stock1 = new Stock(symbol1);
            double profit1 = purchasePower(scan1, stock1);

            if (profit > profit1) {
                System.out.println(symbol + " was more profitable than " + symbol1);
            } else if (profit1 > profit) {
                System.out.println(symbol1 + " was more profitable than " + symbol);

            } else {
                System.out.println(symbol + symbol1 + " were both profitable");
            }
        }




    public static double purchasePower(Scanner scan, Stock reads) {
        System.out.println("How many purchase did you make");
        int numberOfPurchase = scan.nextInt();

        for (int i = 1; i <= numberOfPurchase; i++) {
            System.out.print(i + ": How many shares, at what price per share? ");

            int numberOfShares = scan.nextInt();
            double pricePerShare = scan.nextDouble();
            reads.purchase(numberOfShares, pricePerShare);
        }
//             compute profit using stock object
            System.out.println("What is today's current price per share");
            double price = scan.nextDouble();

            double present = reads.getProfit(price);

            System.out.println("Net profit / loss = " + present);
            System.out.println();

            return present;


        }

    }
