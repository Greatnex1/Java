package HackerRank;

public class SecondLargestElement {
    public static void main(String[] args) {
int numbers[] = {2,15,7,10,12} ;
int n = numbers.length;
        secondLargest(numbers, n);
    }

    private static void secondLargest(int num[], int number_size) {

        int i, first, second;

        //there should be at least two element

        if (number_size < 2) {
            System.out.println("Invalid input");
        }
        int largest = second = Integer.MIN_VALUE;

        //a loop to find the largest element
        for (int j = 0; j < number_size; j++) {
            largest = Math.max(largest, num[j]);

        }
        //a loop to find the second  element


        for (int j = 0; j < number_size; j++) {

            if (num[j] != largest)
                second = Math.max(second, num[j]);
        }
        if (second == Integer.MIN_VALUE)
            System.out.println("There is no second largest element");


        else {
            System.out.printf("Second largest element is %d ", second);

        }


    }
}

