package MyPractices;

import java.util.Random;
import java.util.Scanner;

public class CoinTossing {
    public static int toss ;

    public static void toss(){
        Random rant = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println(">> 1 to toss : \n" +
                           ">> 0 to exit :" );
        int number = scan.nextInt();

        int head = 0;
        int tail = 0;

        while(number != 0 ){
            toss = rant.nextInt(2);
         if (toss == 1){
             flip();
             head++;
         }else{
             flip();
             tail ++;
         }
            System.out.println(">> 1 to toss: ");
           number = scan.nextInt();

        }
        System.out.println("Head occurs " + head);
        System.out.printf("Tail occurs %d%n ", tail);
    }

    private static void flip() {
        enum result {HEAD,TAIL}
        if(toss == 1){
            System.out.println(result.HEAD);
        } else {
            System.out.println(result.TAIL);
        }

    }

    public static void main(String[] args) {
        toss();
    }
}
