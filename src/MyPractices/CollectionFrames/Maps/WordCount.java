package MyPractices.CollectionFrames.Maps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// a program that allows a user to see which word occur the most in a file
public class WordCount {
    public static final int OCCURRENCES = 2;
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(
                """
                         This program displays the most frequently occurring words
                         from the file 'words.txt'
                        """);
        System.out.println();

        //read the file into a map
        Scanner in = new Scanner(new File("words.txt"));
        Map<String,Integer> wordCountMap = getCountMap(in);
        for (String word : wordCountMap.keySet()){
            int count = wordCountMap.get(word);
            if (count >= OCCURRENCES){
                System.out.println(word + " occurs " + count + " times" );
            }
        }

    }

    private static Map<String, Integer> getCountMap(Scanner in) {
        Map<String,Integer> wordCountMap =  new TreeMap<>();
        while(in.hasNext()){
            String word = in.next().toLowerCase();
            if(wordCountMap.containsKey(word)){
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            }else{
                wordCountMap.put(word,1);
            }
        }
        return wordCountMap;
    }
}
