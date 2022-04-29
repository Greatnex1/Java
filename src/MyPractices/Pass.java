package MyPractices;

import java.util.Scanner;

//PseudoCode
//Prompt a user with a Grade Score
// if Grade Score is above 90 but below 100, output A
// if Grade Score is above 80 but below 90, output B
// if Grade Score is above 70 but below 80, output C
// if Grade Score is above 60 but below 70 output D
// if  Grade Score  is below 60, output F

public class Pass {
    public static void main(String... oh) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Grade Score: ");
        int GradeScore = input.nextInt();


        if (GradeScore >= 90 && GradeScore <= 100) {
                System.out.print("A");
            }

            if (GradeScore >= 80 && GradeScore<= 90) {
                System.out.print("B");
            }

            if (GradeScore >= 70 && GradeScore <= 80) {
                System.out.print("C");
            }

            if (GradeScore>= 60 && GradeScore <= 70) {
                System.out.print("D");
            }

            if (GradeScore < 60) {
                System.out.print("F");
            }

        }
    }

//PseudoCode
//Prompt a user with a score
// if the user enter a number 55 & above, print output 'Pass'
// if user enter a number below 55 print output 'Failed'

