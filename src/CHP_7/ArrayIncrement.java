package CHP_7;

public class ArrayIncrement {

        public static void main(String[] args) {
            int[] list = buildOddArray(20);
            incrementAll(list);
            for (int j : list) {
                System.out.print(j + " ");
            }


            System.out.println();
        }


// returns array of given size composed of consecutive odds

        public static int[] buildOddArray(int size) {
            int[] data = new int[size];
             for (int i = 0; i < data.length; i++) {
                data[i] = 2 * i + 1;}
            return data;

        } // adds one to each array element
         public static void incrementAll(int[] data) {

            for (int i = 0; i < data.length; i++) {

                data[i]++;

            }


        }

}
