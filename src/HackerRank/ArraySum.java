package HackerRank;

import java.util.List;

public class ArraySum {
    public static void main(String[] args) {
        //using a method
        //System.out.println(" Sum of array =" + arrSum());
        int sum = 0;
          Integer arr [] = {1,2,3,4,10,11};

          for (int i = 0; i < arr.length ; i++) {
            sum +=arr[i];

           }
          System.out.println("Sum = " + sum);
    }
}

   /* private static int arrSum () {
        int sum =0;
        Integer arry [] = {1,2,3,4,10,11};
        for (int i = 0; i < arry.length; i++) {
            sum +=arry[i];
        }
        return sum;
    }


}
*/