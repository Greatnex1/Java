package CHP_7;

public class Array {
        public static void main(String[] args) {
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
                System.out.println();
                sum(new int[]{1,3,4,5,6,7},3);

                      }

        public static int sum(int [] list) {
                 // System.out.println(list.length);
                return sum(list,0);
        }
        private static int sum(int[] list, int index){
                if(index == list.length){
                        return  0;
                }else{
                      //  System.out.println(list[index]);
                        return  list [index] + sum(list,index+1);
                }
        }

        //using recursion to calculate the sum of numbers in an array

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
