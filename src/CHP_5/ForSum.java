package CHP_5;

public class ForSum {
   // for (int j = x; j <= 4 * x * y; j += y / x)
    public static void main(String[] args) {
        int total = 0;
        for(int number=2; number <=20; number +=2){
            total += number;
        }
        System.out.printf("Therefore sum is %d", total);
    }

}
