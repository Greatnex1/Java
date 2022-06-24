package CHP_7;

import java.util.Scanner;


public class HotelArray {
    public static void main(String...args) {

        String [] room ={" ", " "};
         int [] column = {1,2,3,4};

        Scanner myscan = new Scanner(System.in);
        System.out.println("""
                Enter 1 to book a room
                Enter 2 to leave a room
                Enter 3 check details of a room
                Enter -1 to exist
                
                """);

        int vibe = myscan.nextInt();
        switch (vibe) {
            case 1 -> System.out.printf("Welcome %s, Your room number is room %d", room[0], column[0]);
            case 2 -> System.out.printf("Goodbye %s!", room[0]);
            case 3 -> {
                System.out.printf("Room %d is unavailable %n", column[0]);
                System.out.printf("Room %d is available%n", column[1]);
                System.out.printf("Room %d is available%n", column[2]);
                System.out.printf("Room %d is available", column[3]);
            }
            case -1 -> System.out.print("Exist");
        }

    }
}
