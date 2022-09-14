package MyPractices.Comparables;

public class Numbers {
    public static void main(String[] args) {
        Integer x = 7;
        Integer y = 22;
        Integer z = 7;
//        prints out -1(a less than relationship) if there is no relationship btw data type
//         print out 0 to signify equality relationship
//        prints a positive  number indicating a greater than relationship
        System.out.println(x.compareTo(y));
        System.out.println(x.compareTo(z));
        System.out.println(y.compareTo(z));
        //or

    }



}
