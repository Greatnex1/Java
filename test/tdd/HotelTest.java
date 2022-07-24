package tdd;

import CHP_7.HotelRoomArrayMethod;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {
    HotelRoomArrayMethod hotel;

    @BeforeEach
    void setUp() {
        hotel = new HotelRoomArrayMethod(10);
    }

    @Test
    void hotelHasSpecifiedNumberOfRooms() {
        assertEquals(10, hotel.getRooms().length);
    }
    @Test
    void clientCanGetARoom() {
        String[] allRooms = hotel.getRooms();
        assertNotNull(allRooms);
        for (String room : allRooms) {
            assertNull(room);
        }
    }
        @Test
        void clientCanBookARoom(){
        String name = "Noah";
        String result = hotel.bookRoom(name);
            System.out.println(result);
            String guest = hotel.getGuest(1);
            System.out.println(guest);
            assertEquals(name, guest);
            String secondName = "Dami";
            String result1 = hotel.bookRoom(secondName);
            System.out.println(result1);
            String guest2 = hotel.getGuest(2);
            System.out.println(result1);
            assertEquals(secondName, guest2);

    }
    @Test
    void userCanCheckOut(){
        String name = "Noah";
        String result = hotel.bookRoom(name);
        String secondName = "Dami";
        String result1 = hotel.bookRoom(secondName);
          int roomNumber = 1;
         hotel.checkout(roomNumber);
String guest = hotel.getGuest(roomNumber);
            assertNull(guest);



    }
}
