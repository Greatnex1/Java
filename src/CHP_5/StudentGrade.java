package CHP_5;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        //a five student grade
        int counter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;
        Scanner reads = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Student name :");
             reads.next();
            System.out.print("Enter Student grade :");
            int grade = reads.nextInt();
            counter++;
            switch (grade / 10) { // grade was between 90
                case 9, 10 -> // and 100, inclusive
                        ++aCount;
                // exits switch
                case 8 -> // grade was between 80 and
                        ++bCount;
                // exits switch
                case 7 -> // grade was between 70 and
                        ++cCount;
                // exits switch
                case 6 -> // grade was between 60 and
                        ++dCount;
                default -> // grade was less than 60
                        ++fCount;

            }

        }
        System.out.printf("%nGrade Report %n");

        System.out.printf("Total of the grades entered is %d%n",
                counter);

        System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                "Number of students who received each grade:",
                "Student 1 : ", aCount, // display number of A grades
                "B: ", bCount, // display number of B grades
                "C: ", cCount, // display number of C grades
                "D: ", dCount,
                "F: ", fCount); // display number of D grades

    }

}