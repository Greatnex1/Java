package CHP_7;

import java.util.Arrays;

public class StudentGradeTack {
    private String[] students;
    private String[] subjects;
    private int[] position;
    private int[] totalStudentScore;
    private int[][] scores;

    private int total = 0;

    public StudentGradeTack(int numberOfStudents, int numberOfSubjects) {
        students = new String[numberOfStudents];
        subjects = new String[numberOfSubjects];
        position = new int[numberOfStudents];
        totalStudentScore = new int[numberOfStudents];
        scores = new int[students.length][subjects.length];

    }


    public void enterStudentName(int index, String name) {
        students[index] = name;
    }

    public String thisIsSubject(int index) {
        return subjects[index];
    }

    public void enterScore(int studentIndex, int subjectIndex, int score) {
        scores[studentIndex][subjectIndex] = score;
    }

    public int inspectScore(int studentIndex, int subjectIndex) {
        return scores[studentIndex][subjectIndex];

    }

    public String thisIsStudent(int index) {
        return students[index];
    }

    public void gradesReport() {
        calculateTotalScore();

        setStudentPosition();

        initializeGradeTable();

        setSubjectSummary();

        setClassSummary();

    }


    public void calculateTotalScore() {
        for (int student = 0; student < students.length; student++) {
            total = 0;
            for (int subject = 0; subject < subjects.length; subject++) {
                total += scores[student][subject];
            }
            totalStudentScore[student] = total;
        }
    }

    public void setStudentPosition() {
        calculateTotalScore();

        int[] sortTotalScores = new int[totalStudentScore.length];

        System.arraycopy(totalStudentScore, 0, sortTotalScores, 0, totalStudentScore.length);
        Arrays.sort(sortTotalScores);

        for (int i = 0; i < sortTotalScores.length; i++) {
            int scoreIndex = Arrays.binarySearch(sortTotalScores, totalStudentScore[i]);

            position[i] = students.length - scoreIndex;

        }

    }

    public void initializeGradeTable() {
        for (int student = 0; student < 1; student++) {
            System.out.println("""
                    ============================================================================
                                        
                     STUDENT
                    """);
            for (String sub : subjects
            ) {
                System.out.printf("%-10s", sub);
            }
            System.out.println("TOT    AVG    POS");
            System.out.println("=".repeat(89));
        }
        for (int student = 0; student < students.length; student++) {
            System.out.printf("%2d.%-20s", student + 1, students[student]);
            total = 0;
            for (int subject = 0; subject < subjects.length; subject++) {
                System.out.printf("%-10d", scores[student][subject]);

            }
            double average = (double) totalStudentScore[student] / subjects.length;
            System.out.printf("%-5d% -6.2f%3d%n", totalStudentScore[student], average, position[student]);
        }
        System.out.println("=".repeat(90));
    }

    public void setSubjectSummary() {
        System.out.println("SUBJECT SUMMARY");
        for (int subject = 0; subject < subjects.length; subject++) {
            System.out.printf("%s%n", subjects[subject]);
            highestSubject(subject);
            lowestSubject(subject);
            TotalScoreOfSubject(subject);
            AverageScoreOfSubject(subject);
            System.out.printf("""
                                        
                    Number of passes : %d
                                        
                    Number of fails : %d
                    """, passedSubjects(subject), failedSubjects(subject));
            System.out.println("_______________________________________________________________________________");
        }
        highestFailure();
        highestPasses();
        overallHighest();
        overallLowest();
        System.out.println("____________________________________________________________________________________");
        System.out.println("____________________________________________________________________________________");
    }


    public void setClassSummary() {
        System.out.println("CLASS SUMMARY");
        System.out.println("=".repeat(30));
        bestStudent();
        System.out.println("=".repeat(30));
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        worstStudent();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("=".repeat(30));
        classTotalScore();
        classAverageScore();
        System.out.println("=".repeat(30));
    }

    public void highestSubject(int subjectIndex) {
        int highestScore = scores[0][subjectIndex];

        for (int student = 0; student < students.length; student++) {
            if (scores[student][subjectIndex] > highestScore) {
                highestScore = scores[student][subjectIndex];
            }

        }
        for (int student = 0; student < students.length; student++) {
            if (scores[student][subjectIndex] == highestScore) {
                highestScore = scores[student][subjectIndex];
                if (scores[student][subjectIndex] > highestScore) {
                    System.out.printf("The Student with highest Score is : %s scoring %d%n", students[student], highestScore);
                }
            }

        }


    }

    public void lowestSubject(int subjectIndex) {
        int lowestScore = scores[0][subjectIndex];

        for (int student = 0; student < students.length; student++) {
            if (scores[student][subjectIndex] < lowestScore) {
                lowestScore = scores[student][subjectIndex];

            }
        }
        for (int student = 0; student < students.length; student++) {
            if (scores[student][subjectIndex] < lowestScore) {
                System.out.printf("The Student with Lowest Score is : %s scoring %d%n", students[student], lowestScore);

            }
        }
    }

    public void TotalScoreOfSubject(int subjectIndex) {
        int sum = 0;
        for (int student = 0; student < students.length; student++) {
            sum += scores[student][subjectIndex];

        }
        System.out.printf("Total Score is : %d%%n", sum);

    }

    public void AverageScoreOfSubject(int subjectIndex) {
        int sum = 0;
        for (int student = 0; student < students.length; student++) {
            sum += scores[student][subjectIndex];

        }
        double average = (double) sum / students.length;
        System.out.printf("Average score is : %.2fn", average);
    }

    public int passedSubjects(int subjectIndex) {
        int passes = 0;
        for (int student = 0; student < students.length; student++) {
            if (scores[student][subjectIndex] > 60) {
                passes++;

            }


        }
        return passes;
    }

    public int failedSubjects(int subjectIndex) {
        int failed = 0;
        for (int student = 0; student < students.length; student++) {
            if (scores[student][subjectIndex] < 60) {
                failed++;
            }
        }
        return failed;
    }

    public void overallHighest() {
        int highestScore = scores[0][0];
        for (int student = 0; student < students.length; student++) {
            for (int subject = 0; subject < subjects.length; subject++) {
                if (scores[student][subject] > highestScore) {
                    highestScore++;
                }

            }

        }

    }

//    public void highestFailure() {
//        int lowestScore = scores[0][subjectIndex};
//        for (int student = 0; student < students.length; student++) {
//            for (int subject = 0; subject < subjects.length; subject++) {
//                if (scores[student][subject] < lowestScore) {
//                    lowestScore++;
//                }
//
//            }
//        }
//    }
    public void overallLowest(){
        int lowestScore = scores [0][0];
        for (int student = 0; student < students.length ; student++) {
            for (int subject = 0; subject < subjects.length ; subject++) {
                if (scores[student][subject] < lowestScore){
                    lowestScore++;
                }

            }

        }


    }
public void highestFailure(){
 int highestfailed = failedSubjects(0);
    for (int subject = 0; subject < subjects.length; subject++) {
        if(failedSubjects(subject) > highestfailed){
            highestfailed = failedSubjects((subject));
        }

    }
//    for (String subject: subjects
//         ) {
//        System.out.println(subject);
//
//    }
    for (int subject = 0; subject <subjects.length ; subject++) {
        if(failedSubjects(subject) == highestfailed) {
            System.out.printf("Hardest subject is %s with %d fails ",subjects[subject], highestfailed);
        }

    }
}
public void highestPasses(){
        int highpass = passedSubjects(0);
    for (int subject = 0; subject <subjects.length ; subject ++) {
        if (passedSubjects(subject) > highpass){
            highpass = passedSubjects((subject));
        }
    }
    for (int subject = 0; subject < subjects.length; subject++) {
        if(passedSubjects(subject) == highpass){
            System.out.printf("Easiest subject is %s with %d passes ", subjects[subject],highpass);
        }

    }
}
public void bestStudent(){
        int supremeTotal =  totalStudentScore[0];
    for (int student = 0; student <students.length ; student++) {
        if(totalStudentScore[student] > supremeTotal){
            supremeTotal = totalStudentScore[student];
        }

    }

}
public void worstStudent(){
  int worstTotal = totalStudentScore[0];
    for (int student = 0; student < students.length ; student++) {
        if(totalStudentScore[student] > worstTotal){
            worstTotal = totalStudentScore[student];
        }

    }
}
public void classTotalScore(){
        int sum = 0;
    for (int student = 0; student <students.length ; student++) {
        sum = sum + totalStudentScore[student];
    }
    System.out.println("THe class total score is : %d%n, sum");

}

public void classAverageScore(){
        int sum_average = 0;
    for (int student = 0; student <students.length ; student++) {
        sum_average= sum_average + totalStudentScore[student];

    }
    double average = (double) sum_average / students.length;
    System.out.printf(" The class average score is : %.2f%n", average);

}

    @Override
    public String toString() {
        return "StudentGradeTack{" +
                "students=" + Arrays.toString(students) +
                ", subjects=" + Arrays.toString(subjects) +
                ", position=" + Arrays.toString(position) +
                ", totalStudentScore=" + Arrays.toString(totalStudentScore) +
                ", scores=" + Arrays.toString(scores) +
                ", total=" + total +
                '}';
    }
}
