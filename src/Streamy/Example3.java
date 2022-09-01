package Streamy;

import java.io.*;

public class Example3 {
    //    Using try-with-resources statement
    public static String main(String... args) throws IOException {

        try (
//
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                PrintWriter printWriter = new PrintWriter(new FileWriter("test.txt"))) {
            return bufferedReader.readLine();

        }
    }
}
