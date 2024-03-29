package MyPractices.CollectionFrames.Lists;

import java.util.*;

//a program that prints a prime numbers of any maximum number given
public class PrimeNumbers {
    public static void main(String[] args) {
        Vector<String> min = new Vector<>();
        min.add("Vibe");
        min.add("Ayo");
        System.out.println(min);
        System.out.println(
                """
                        This program will tell you all prime numbers up 
                      in   to a given maximum         
                        """);
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Maximum number");
        int max = scan.nextInt();

        List<Integer> primes = sieve(max);

        System.out.println("Prime numbers up to " + max + " :");
        System.out.println(primes);

        //a method to return list of prime numbers up to a given max using the sieve of Eratosthenes algorithm
    }

    private static List<Integer> sieve(int max) {
        List<Integer> primes = new LinkedList<>();
        List<Integer> numbers = new LinkedList<>();
        for (int i = 2; i <=max ; i++) {
            numbers.add(i);
        }
        while (!numbers.isEmpty()){
            int front = numbers.remove(0);
            primes.add(front);

            Iterator<Integer> itr = numbers.iterator();
            while (itr.hasNext()){
                int current = itr.next();
                if(current % front == 0){
                    itr.remove();
                }
            }
        }
        return primes;
    }

}
