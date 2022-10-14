package MyPractices.CollectionFrames.Maps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NumberCount {
    public static final int INTERVALS = 2;
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(
                """
                         This program displays the most frequently occurring numbers
                         from the file 'number.txt'
                        """);

        System.out.println();

        //read the file into a map
        Scanner in = new Scanner(new File("number.txt"));
        Map<Integer,Integer> numberCountMap = getCounterMap(in);
        for (Integer number : numberCountMap.keySet()){
            int count = numberCountMap.get(number);
            if (count > INTERVALS){
                System.out.println(number + " occurs " + count + " times" );
            }
        }

    }

    private static Map<Integer, Integer> getCounterMap(Scanner in) {
        Map<Integer,Integer> wordCountMap =  new TreeMap<>();
        while(in.hasNextLine()){
            int number = in.nextInt();
            if(wordCountMap.containsKey(number)){
                int count = wordCountMap.get(number);
                wordCountMap.put(number, count + 1);
            }else{
                wordCountMap.put(number,1);
            }
        }
        return wordCountMap;
    }
}
