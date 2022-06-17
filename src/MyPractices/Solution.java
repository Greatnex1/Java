package MyPractices;

import java.util.Scanner;

public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter any number");
            int n = scan.nextInt();

            if(n % 2== 0){
                System.out.print("Weird");
            }
            if (n %2 == 1){
                System.out.print("Not weird");
            }
            if(n <= 20){
                System.out.print("Weird");
            }
            if( n > 20){
                System.out.print(" Not weird");

            }
        }
}
