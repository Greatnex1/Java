package HackerRank;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        System.out.println("Person 1 :");

        StringTokenizer st1 = new StringTokenizer("How are you ?", " ");

        while(st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }
        StringTokenizer st2 = new StringTokenizer("Languages: Java, Javascript", " " );
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }
    }

}