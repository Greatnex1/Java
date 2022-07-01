package CHP_7;

public class PassingArraysToMethods {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.printf(
                "Effects of passing reference to entire array:%n" +
                        "The values of the original array are:%n");
// output original array elements
        for (int value : array) {
            System.out.printf(" %d", value);

        }
        System.out.printf("%n The value of original array at array[0] is: %d%n", array[0]);
        // pass array reference
        modifyArray(array);
        System.out.printf("%n%nThe values of the modified array are:%n");
// output modified array elements
        for (int value : array) {
            System.out.printf(" %d", value);
        }
        System.out.printf(
                "%n%nEffects of passing array element value:%n" +
                        "array[0] before modifyElement: %d%n", array[0]);
        modifyElement(array[0]); // attempt to modify array[3]
        System.out.printf(
                "array[0] after modifyElement: %d%n", array[0]);
    }

    // multiply each element of an array by 2
    public static void modifyArray(int[] array2) {
        for (int counter = 0; counter < array2.length; counter++) {
            array2[counter] *= 2;
        }
    }

    // multiply argument by 2
    public static void modifyElement(int element) {
        element *= 2;

        System.out.printf(
                "Value of element in modifyElement: %d%n", element);
    }
}