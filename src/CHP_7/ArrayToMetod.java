package CHP_7;

public class ArrayToMetod {
    public static void main(String[] args) {
        int[] myArray = {3, 1, 2, 5, 4};

        sum(myArray);
    }

    public static void sum(int[] myArray) {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++)
            sum += myArray[i];
        System.out.println("Sum is " + sum);

    }
 }

