package MyPractices;

public class OverLappingElement {

    public static void main(String[] args) {
        int[] set_A = {3, 4, 1, 9, 3};

        int[] setB = {3, 1, 7, 9};

//        for (int i : set_A) {
//
//            for (int j = 0; j < setB.length; j++) {
//
//            }
//
//        }
        for (int i : setB) {
            if (i == setB[3]) {
                System.out.println(i);
            }

        }
    }

}