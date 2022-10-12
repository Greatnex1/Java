package MyPractices;

import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class SearchWord {
    public static void main(String[] args) throws FileNotFoundException {
      readBook("words.txt");

    }

    public static List<String> readBook(String filename) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.println("What word do you wanna search for ");
        String word = console.nextLine();
        List<String> words = readBook("words.txt");
        int index = words.indexOf(word);
        if (index >= 0) {
            System.out.println(word + "is word #" + index);
        } else {
            System.out.println(word + " is not found");
        }

        return words;
    }



}
