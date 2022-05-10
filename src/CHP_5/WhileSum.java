package CHP_5;

public class WhileSum {
    public static void main(String[] args) {
        int total = 0;
        int number= 2;
        while(number<=20){
            number +=2;
            total +=number;
        }
        System.out.printf("Therefore sum is %d", total);
    }
}
