package Streamy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Example1 {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            String statement = bufferedReader.readLine();
            PrintStream printStream = new PrintStream("test.txt");
            printStream.println(statement.toUpperCase());

//            System.out.println(":" + statement);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

//        System is a class, Out is  variable name and println is class
//        PrintStream is a high level stream


