package CHP_7;

public class Set {
    public static void main(String[] args) {
//        c[0] = (3);
//        c[1] = (1);
//        c[2] = (7);
//        c[3] = (9);
        int c[] = {3, 1, 7, 9};

        int total = 0;

        for (int j = 0; j < 4 ; j++) {
            total +=c[j] ;
           }
        System.out.println("total for variable c is " + total);

        int d[] = {2, 4, 1, 9, 3};
        int sum = 0;

     for (int i = 0; i < d.length; i++) {
       sum += d[i];
 }
     System.out.println("total for variable d is " + sum);




}
    }

