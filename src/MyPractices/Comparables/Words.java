package MyPractices.Comparables;

public class Words {
    public static void main(String[] args) {
        String w = "Hi";
        String w1 = "Hey";
        String w2 = "Hey";
        System.out.println(w1.compareTo(w));
        System.out.println(w.compareTo(w2));
        System.out.println(w1.compareTo(w2));
    }
}
