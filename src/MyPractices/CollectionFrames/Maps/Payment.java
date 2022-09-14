package MyPractices.CollectionFrames.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// a program that uses Map collection to assosciate people salary with their names
public class Payment {
    public static void main(String[] args) {
        Map<String, Double> salaryMap = new HashMap<>();
        salaryMap.put("Steven", 1000.00);
        salaryMap.put("Lady", 4000.00);
        salaryMap.put("Love", 3000.00);
        salaryMap.put("Angel", 2000.00);
        salaryMap.put("Zoe", 6000.00);
       // System.out.println(salaryMap);
        double angelSalary = salaryMap.get("Angel");
       // System.out.printf("Angel's salary is $%.2f\n",angelSalary);

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a name :");
        String name = scan.nextLine();
        if (salaryMap.containsKey(name)) {

            double salary = salaryMap.get(name);
            System.out.printf("%s's salary is $%.2f\n", name, salary);
        } else{
            System.out.println("There is no record for " + name);
        }
    }
}
