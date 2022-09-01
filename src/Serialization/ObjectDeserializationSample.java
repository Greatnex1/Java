package Serialization;

import java.io.*;

public class ObjectDeserializationSample {
    FileInputStream fileInputStream;

    public static void main(String[] args) {
        try (
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("dog"));
        ) {
            var dog = (Dog) objectInputStream.readObject();
            System.out.println(dog);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}