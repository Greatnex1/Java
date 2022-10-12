package MyPractices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>(
                List.of(1,1,4,5,6,7,8,9,0)
        );
        System.out.println("Enter a number ");
        int search = scan.nextInt();
        if(number.contains(search)){
            int result = number.get(0);
            System.out.println("Stored " + result);
        }
        else{
            System.out.println("The number entered is not found in the storage");
        }
    }



}
