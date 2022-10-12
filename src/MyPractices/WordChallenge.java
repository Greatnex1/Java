package MyPractices;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordChallenge {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Welcome to Scrabble Word Challenge");

        Scanner console = new Scanner(new File("dictionary.txt"));
        List<String> words =new ArrayList<>();
       while(console.hasNextLine()){
            String word = console.next();
           words.add(word);
        }
        Scanner scan = new Scanner(new File("dictionary.txt"));
        System.out.println("Word to challenge (Enter to quit)");
        String target = scan.nextLine();
        while (target.length()>0){
            int index = Collections.binarySearch(words,target);

            if(index >= 0){
                System.out.println("\"" + target + "\" is word #" + index + " of " + words.size()) ;
            }
            else{
                System.out.println("\"" + target + "\"is not found");
            }
            System.out.println("Word to challenge (Enter to quit)");
            target = scan.nextLine();
        }
    }
}
