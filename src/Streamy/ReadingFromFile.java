package Streamy;

import java.io.*;

public class ReadingFromFile {
    public static void main(String[] args) {
//        try {
//            FileInputStream fileInputStream = new FileInputStream("testy.txt");
//        } catch(FileNotFoundException e){
//            e.printStackTrace();
//        }
//           using try with resources
        try {
            FileReader fileReader = new FileReader("testy.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String sentence = bufferedReader.readLine();
            System.out.println(sentence);
        } catch
            (IOException e){
            e.printStackTrace();
        }

        }


    }
