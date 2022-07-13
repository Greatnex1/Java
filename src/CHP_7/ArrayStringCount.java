package CHP_7;

public class ArrayStringCount {
    public static void main(String[] args) {
        String s = "Mississippi";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                count++;
                 }
           }
        System.out.println(count);



    }
}
