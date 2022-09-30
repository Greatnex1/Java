package MyPractices.CollectionFrames.Sets;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//a program that counts how many words are in a file, removing duplicates
public class UniqueWords {
    public static void main(String[] args) throws FileNotFoundException {
        Set <String> sentences = new HashSet<>();
        Scanner in = new Scanner(new File("words.txt"));

        while(in.hasNext()){
            String sentence = in.next();
            sentence = sentence.toLowerCase();
            sentences.add(sentence);
        }
        System.out.println("Numbers of unique words = " + sentences.size());
    }
}
