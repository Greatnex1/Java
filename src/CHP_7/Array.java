package CHP_7;

public class Array {
        public static void main(String[] args) {

//
//                //Array declarations
                //  int[] myArray = new int[12];
                //  int[] kArray = {50, 60, 70, 80};
                //  String[] mArray = {"how", " hello "};
                // String[] wArray = new String[5];


                // System.out.println("my array length is " + myArray.length);
                //  System.out.println("my array length is " + kArray.length);
                // System.out.println("my  String array length is " + mArray.length);
                //  System.out.println("my string array length is at index 1 is " + mArray[mArray.length - 1]);
                // how to add items in an array
                //    System.out.println(" my array at 0 is " + myArray[0]);
                // myArray[0] = 25;
                // for (int i = 0; i < kArray.length; i++) {
                //         System.out.println(kArray.length-);

                // }
                int[] jArray = {10, 20, 33, -6, -7};
                int total = 0;
                int min = 0;
                int max = 0;

                for (int j = 0; j < jArray.length; j++) {
                        total += jArray[j];
                        if (max < jArray[j]) {
                                max = jArray[j];
                        }
                        if (min > jArray[j]) {
                                min = jArray[j];
                        }

                }


                System.out.println("total is " + total);
                System.out.println("average is " + total / jArray.length);
                System.out.println("largest is " + max);
                System.out.println("smallest is " + min);

                      }
}

// Calculate the sum of all elements of an array
// using enhanced for loop
//class Main {
//        public static void main(String[] args) {
//
//                // an array of numbers
//                int[] numbers = {3, 4, 5, -5, 0, 12};
//                int sum = 0;
//
//                // iterating through each element of the array
//                for (int number: numbers) {
//                        sum += number;
//                }
//
//                System.out.println("Sum = " + sum);
//        }
//}
//
//
