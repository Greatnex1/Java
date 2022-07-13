package MyPractices;

public class Char {
    public static void main(String[] args) {
        printVertical("Hello");


    }
    public static void printVertical(String message) {
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            System.out.println(ch);
        }
    }
    public static String reverse(String phrase) {
        String result = "";
        for (int i = 0; i < phrase.length(); i++) {
            result = phrase.charAt(i) + result;
        }
        return result;
    }
}
