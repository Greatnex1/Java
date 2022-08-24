package CHP_7.ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Duplicates {


    public static void main(String[] args) {
        Scanner input = null;
        try {
            input = new Scanner(new File("names.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ArrayList<String> list = new ArrayList<>();
        while (input.hasNext()) {
            String name = input.next();
            if (!list.contains(name)) {
                list.add(name);
            }

            System.out.println("list = " + list);
        }


    }

}
