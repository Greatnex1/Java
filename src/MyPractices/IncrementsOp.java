package MyPractices;

public class IncrementsOp {
    public static void main(String[] args) {
//        x = 1 + 10, x =11 * y=20-1, 19 11*19

//it uses the new value of
//x
//x( ++x )
// it uses the old value of y
//( y −−), which is 11 times 20, equals 220.
// x ++ means give me the value of x before increment, ++x  means give me the value of x after increment same goes for the sub
        int x = 10;
        int y = 20;
        int z = ++x * --y;
//        y--
        System.out.println(z);
    }
}
