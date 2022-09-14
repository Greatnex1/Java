package Streamy;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    //    writing to a file
//    Streams are resources which when opened needs to be closed

    public static void main(String[] args) {


        try {
            PrintWriter printWriter = new PrintWriter("testy.txt");

            printWriter.println("I am");
//            printWriter.append('2');
           printWriter.close();
//            printWriter.flush();
        } catch (
                FileNotFoundException err){
            err.printStackTrace();
        }


    }
}