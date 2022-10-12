package MyPractices;

import java.io.File;
import java.util.Scanner;

public class DirectoryCrawler {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a directory or file name");
        String name = console.nextLine();

        File file = new File(name);
        if(!file.exists()){
            System.out.println("No such file / directory");
        }
        else{
            print(file,0);
        }

    }

    private static void print(File file, int level) {
        for (int i = 0; i < level; i++) {
            System.out.println("    ");

        }
        System.out.println(file.getName());
        if(file.isDirectory()){
            for (File subFile : file.listFiles()
                 ) {
                print(subFile, level+1);

            }
        }
    }
}
