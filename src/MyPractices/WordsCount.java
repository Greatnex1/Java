package MyPractices;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordsCount {
//    A program that reads the number of words via passing a  file object into a Scanner object
    public static void main(String[] args)  throws FileNotFoundException  {
            Scanner scan = new Scanner(new File("exe.txt"));
            int count = 0;
            while(scan.hasNext()){
                String word = scan.next();
                count++;
            }
        System.out.println("total words = " + count );
        }
    }

