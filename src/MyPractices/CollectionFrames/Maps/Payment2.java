package MyPractices.CollectionFrames.Maps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Payment2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Map<Integer, String> amountPaid = new TreeMap<>();
        amountPaid.put(1000,"Dan");
        amountPaid.put(10000,"Sam");
        amountPaid.put(2000,"Ade");
        amountPaid.put(5000,"Ashly");


        System.out.print("Enter an amount ($) :");
        Integer amount = console.nextInt();
        if (amountPaid.containsKey(amount)) {

            String name = amountPaid.get(amount);
            System.out.printf(" A total of $%d as salary belongs to %s\n", amount, name);
        } else{
            System.out.println("There is no record for this amount  $" + amount);
        }

    }
}
