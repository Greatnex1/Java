package CHP_4;
import java.util.*;
public class RandomNumber {
    public static void main(String[] args) {

        Random generator = new Random();
        for (int i = 0; i <10 ; ++i) {
            int  randomNumber = generator.nextInt(10);
            System.out.println("Random number equals : " + randomNumber);
        }

    }
}
