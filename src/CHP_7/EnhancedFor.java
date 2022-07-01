package CHP_7;

public class EnhancedFor {
    public static void main(String[] args) {
        int [] arrays = {56,78,90,98,91,90,97};
        int total = 0;

        for (int number: arrays) { total = total + number;}

        System.out.printf("Total number is : %d%n", total);
    }
}
