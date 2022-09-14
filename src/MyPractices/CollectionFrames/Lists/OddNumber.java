package MyPractices.CollectionFrames.Lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        System.out.println(
                """
                         This program will tell you all odd numbers up 
                         to a given maximum         
                        """);
        System.out.println();
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a Maximum number");
        int max = console.nextInt();

        List<Integer> odds = sieve(max);

        System.out.println("Odd numbers up to " + max + " :");
        System.out.println(odds);

        //a method to return list of prime numbers up to a given max using the sieve of Eratosthenes algorithm
    }


    private static List<Integer> sieve(int max) {
        List<Integer> primes = new LinkedList<>();
        List<Integer> number= new LinkedList<>();
        for (int i = 2; i <=max ; i++) {
            number.add(i);
        }
        while (!number.isEmpty()){
            int front = number.remove(0);
            primes.add(front);

            Iterator<Integer> itr = number.iterator();
            while (itr.hasNext()){
                int current = itr.next();
                if(current % front == 1){
                    itr.remove();
                }
            }
        }
        return number;
    }

}


