package CHP_6;

public class SumOfIntegers {
    public static void main(String[] args) {
int answer = sum(100);

        System.out.println("The sum of 100 integers is : " + answer);
    }
    public static int sum(int numbers){
        return  (numbers + 1 ) * numbers/2;
    }
}
