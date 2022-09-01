package LamdaStreams;

public class Main1 {
    public static void main(String[] args) {
        Animal cat = System.out::println;

//        or
//        Animal cat = sound -> System.out.println("Cat sounds " + sound);
        cat.sound("Meow");
    }
}
