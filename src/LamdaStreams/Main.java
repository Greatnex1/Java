package LamdaStreams;

public class Main {
    public static void main(String[] args) {
        Human h = (word)-> System.out.println("I am a grown man " + word );
//        Human f = () -> System.out.println
        h.speak("now");
        Human.eat();

//        System.out.println(e);

    }
}
