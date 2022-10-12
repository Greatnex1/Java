package MyPractices.CollectionFrames.Sets;

import com.sun.source.tree.Tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//a program that prints out sentences starting with 'd' in a file using TreeSet
public class SortedWords {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> sentences = new TreeSet<>();
        Scanner in = new Scanner(new File("words.txt"));

        while(in.hasNext()) {
            String sentence = in.next();
            sentence = sentence.toLowerCase();
            if (sentence.startsWith("d")) {
                sentences.add(sentence);
            }
        }
        System.out.println("Three letter 'd' word " + sentences);
    }
    }

