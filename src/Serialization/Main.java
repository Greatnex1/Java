package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Dog dog = new Dog("Wills", 10);
//        dog.setName("Ayo");
        try(
                ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream("dog"));
                ){
            out.writeObject(dog);
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}