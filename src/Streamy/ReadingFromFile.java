package Streamy;

import java.io.*;

public class ReadingFromFile {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("testy.txt"));
            String sentence = bufferedReader.readLine();

                System.out.println(sentence);
                bufferedReader.close();

        } catch
            (IOException e){
            e.printStackTrace();
        }

        }


    }
