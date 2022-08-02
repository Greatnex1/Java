package CHP_7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharonHostelTest {
    SharonHostel hostel;

    @BeforeEach
    void setUp() {
        hostel = new SharonHostel(100);
    }

    @Test
    void testHostelHasTheNumberOfRoomsSpecified() {
        assertNotNull(hostel);
    }

    @Test
    void testStudentCanGetARoom() {
        String [] allRooms = hostel.getRooms();
        for (String room : allRooms) {
            assertNull(room);
        }

       }

    @Test
    void testStudentCanBookARoom(){
        String student = "John";
     String booking =  hostel.bookRoom(student);
        System.out.println(booking);
        String order = hostel.getGuest(1);
//        System.out.println(name +"You have successfully booked a room");
        assertEquals(student, order);
    }
    @Test
    void testRoomsCanBeBookedWithAnId(){
//        hostel.setId("2234");
//        assertEquals("2234", hostel.getId());

        String id = "2234";
        String order = hostel.bookRoomWithId(id);
        System.out.println(order);
        String arrange = hostel.getGuest(1);
        assertEquals(order,arrange);

    }
    }
