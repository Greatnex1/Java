package MyPractices.CollectionFrames.Sets;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lottery {
    private static final int NUMBERS = 6;
    private static final int MAX_NUMBER = 40;
    private static final int PRIZE = 100;


    public static void main(String[] args) {
        Set<Integer> winning = creatingWinningNumbers();
        Set<Integer> ticket = getTicket();
        System.out.println();
        Set<Integer> matches = new TreeSet<>(ticket);
        matches.retainAll(winning);

        System.out.println("Your ticket number was : " + ticket);
        System.out.println("Winning numbers : " + winning);
        if (matches.size() > 0) {
            double prize = PRIZE * Math.pow(2, matches.size());
            System.out.println("Matched numbers : " + matches);

            System.out.printf("Your prize is $%.2f\n", prize);

        }
    }

    public static Set<Integer> getTicket() {
        Set<Integer> ticket = new TreeSet<>();
        Scanner console = new Scanner(System.in);
        System.out.println("Type " + NUMBERS + " Lotto numbers : ");
        while (ticket.size() < NUMBERS) {
            int number = console.nextInt();
            ticket.add(number);


        }
        return ticket;
    }


    public static Set<Integer>  creatingWinningNumbers(){
        Set<Integer> winning = new TreeSet<>();
        Random r = new Random();
        while(winning.size() < NUMBERS){
            int number = r.nextInt(MAX_NUMBER) + 1;
            winning.add(number);
        }
        return winning;
    }
}
