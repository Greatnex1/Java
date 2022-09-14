package MyPractices;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("i-write.txt");
            fileWriter.write("a written word from static void main");
            fileWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

