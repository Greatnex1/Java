package CHP_4;

import java.util.Scanner;

//4.10
//    Pseudocode
//    Initialize total to zero
//    Initialize counter to zero
//    Prompt the user to enter the first grade
//    Input the first grade (possibly the sentinel)
//    While the user has not yet entered the sentinel
//    Add this grade into the running total
//    Add one to the grade counter
//    Prompt the user to enter the next grade
//    Input the next grade (possibly the sentinel)
//    If the counter is not equal to zero
//    Set the average to the total divided by the counter
//    Print the average
//            Else
//    Print “No grades were entered”
public class GradeAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        int counter = 0;
        System.out.print("Enter Student Grade or -2 to Quit:");
        int grade = in.nextInt();
        while(grade != -2) {
            total = total + grade;
            counter += 1;

            System.out.print("Enter Student Grade or -2 to Quit:");
           grade = in.nextInt();
        }
            if (counter != 0) {
                double average = (double) total / counter;
                System.out.printf("%nTotal of the %d grades entered is %d%n",
                        counter, total);
                System.out.printf("Class average is %.2f%n", average);
            }
            else {
                System.out.println("No grades entered");
            }
        }

    }


