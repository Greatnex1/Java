package CHP_7;

public class GradeBookMain {
    public static void main(String[] args) {
// array of student grades
        int[] gradesArray = {87, 64, 94, 100, 83, 78, 85, 91, 76, 87};
//int [] stud = {0,1,2,3,4,5,6,7,8,9,10};

        //creating an object of Grade
       GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming", gradesArray);
//        GradeBook myGradeBook = new GradeBook("The following " + subjects, gradesArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());


        myGradeBook.processGrades();
    }
}