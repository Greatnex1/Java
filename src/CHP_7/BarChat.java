package CHP_7;

public class BarChat {
    public static void main(String[] args) {
        //storage for scores
        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
//        int[] arrays = {2, 3};
//        array[7] = 5;
        System.out.println("Grade distribution:");
// for each array element, output a grade
        for (int counter = 0; counter < array.length; counter++) {
            //  for (int i = 0; i < arrays.length; i++) {


// output bar label ("00-09: ", ..., "90-99: ", "100: ")
            if (counter == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ",
                        counter * 10, counter * 10 + 9);
            }
// print bar of GRADE A, B, C, D
            for (int grade = 0; grade < array[counter]; grade++) {

//                    if(counter >= 7  ){
//                        System.out.print("A");
//                    }
//
//                   else if(counter <= 4){
//                        System.out.print("D");
//                    }
//
//
//                   else if(counter <=5){
//                        System.out.print("C");
//                    }
//
//                  else if(counter <= 6){
//                        System.out.print("B");
//                    }
//                    else{
//                        System.out.print("F");
//
//                    }
////
//                }
                System.out.print("[]");
            }
            System.out.println();
        }
    }
}

