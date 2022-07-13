package MyPractices;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int sum = 0;

        while(sum != 7 ){
            int rollOne = rand.nextInt(6) + 1;
            int rollTwo  = rand.nextInt(6)+ 1;
         sum =  rollOne + rollTwo;
            System.out.println(rollOne + " + " + rollTwo + " = " + sum );

        }
        System.out.println();
        System.out.println(sum + " begins the game!");
    }
}
