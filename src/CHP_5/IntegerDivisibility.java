package CHP_5;

public class IntegerDivisibility {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i <=30 ; i++) {
            if ( i % 3 == 0){
                System.out.println(i);
            }
            total = total + i;
            }


        System.out.printf("%nTotal of value of number divisible by 3 is %d%n" , total);


    }
}
