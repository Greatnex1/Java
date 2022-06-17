package CHP_4;

import java.util.Scanner;
//4.11
//    Pseudocode
//    Initialize passes to zero
//    Initialize failures to zero
//    Initialize student counter to one
//    While student counter is less than or equal to 10
//    Prompt the user to enter the next exam result
//    Input the next exam result
//    If the student passed
//    Add one to passes
//    Else
//    Add one to failures
//    Add one to student counter
//    Print the number of passes
//    Print the number of failures
//    If more than eight students passed
//    Print “Bonus to instructor!”
public class ExaminationResults {

    public static void main(String[] args) {
        int pass = 0;
        int failure = 0;
        int counter = 1;
        Scanner put = new Scanner(System.in);
        while (counter <= 10) {

            System.out.print(" Enter student score : ");
            int exam = put.nextInt();
            if (exam >= 80){
                pass ++;
            }
            else {
                failure ++ ;
            }
            counter += 1 ;
        }
        System.out.printf("Passed : %d%n Failed : %d%n", pass, failure);
        if (pass > 6 ){
            System.out.println("Bonus!!");
        }
        else{
            System.out.println("Low performance by Students");
        }

    }
}
