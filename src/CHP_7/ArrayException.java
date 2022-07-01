package CHP_7;

public class ArrayException {
    public static void main(String[] args) {
        int[] myArray = {1, 3, 4, 78, 341, 45, -899};
        for (int i = 0; i < myArray.length; i++) {
            int randomIndex = (int) (Math.random() * 10);
            try {
                System.out.println(" array at random index " + randomIndex + " is " + myArray[randomIndex]);

            }
            catch (ArrayIndexOutOfBoundsException error){
                System.out.println("Invalid index encountered");
            }
        }

    }
}
