package CHP_7;

import java.util.Date;
import java.util.Scanner;

public class HotelRoomArray {
    public static void main(String[] args) {
        Hotel lordsHotel = new Hotel(30);
        Date current_Date = new Date();
        System.out.println(current_Date);
        System.out.println("Welcome to LordsHotel");
        int sentinel = 1;
        while (sentinel != -1) {
            String prompt = """
                    
                    Press 1 to book a room
                    Press 2 to checkout
                    Press 3 to view room details
                    Press -1 to exit
                                        
                    """;
            System.out.println(prompt);
            Scanner info = new Scanner(System.in);
            int response = info.nextInt();
            info.nextLine();
            switch (response) {
                case 1 -> {
                    System.out.println(" Enter your name");
                    String name = info.nextLine();
                    lordsHotel.bookRoom(name);

                }
                case 2 -> {
                    System.out.println("Enter your room number");
                    int room = info.nextInt();
                    lordsHotel.checkout(room);
                }
                case 3 -> {
                    System.out.println("View room details by entering a number");
                    int hall = info.nextInt();
                    String guest = lordsHotel.getGuest(hall);
                    System.out.println("guest is " + guest);
                }
                case -1 ->{
                    sentinel = -1;
                    System.out.println("Thank you for coming");

                }


            }
                }
            }
        }


