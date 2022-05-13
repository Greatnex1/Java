package tdd;

public class Kata {
    public static int noOfFactorsOf(int number) {
        int factors = 0;
         int  i=1;
        while(i<=number ) {
            if (number % i == 0) {
                factors +=  1;
                i++;

            }
        }


            return factors;

        }

    public static boolean isPrime(int number) {

if(noOfFactorsOf(number)==2) return true;

          return false;
        }


    public int add ( int firstNumber, int secondNumber){
            return firstNumber + secondNumber;

        }

        public int substract ( int firstNumber, int secondNumber){

            int a = firstNumber - secondNumber;
            return a;
        }

        public int product ( int firstNumber, int secondNumber){
            int mult = firstNumber * secondNumber;
            return mult;
        }

        public int quotient ( int firstNumber, int secondNumber){
            int div = secondNumber / firstNumber;
            return div;
        }

        public String gradeScore ( int score){
            String grade = null;

            if (score >= 90 && score <= 100) {
                grade = "A";
            }

            if (score >= 80 && score <= 90) {
                grade = "B";

            }

            if (score >= 70 && score <= 80) {
                grade = "C";
            }

            if (score >= 60 && score <= 70) {
                grade = "D";
            }

            if (score < 60) {
                grade = "F";
            }
            return grade;
        }

    }
