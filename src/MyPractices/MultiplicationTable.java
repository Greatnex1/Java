package MyPractices;

public class MultiplicationTable {
//a two times multiplication table
    public static void main(String[] args) {
        int multiply = 1;
int x = 1;
        while (multiply <= 15) {
            ++multiply;

            if (multiply % 2 == 0) {

                System.out.println("2 times " + "" + x + " = " + multiply);
                x+=1;
            }
        }
    }
}
