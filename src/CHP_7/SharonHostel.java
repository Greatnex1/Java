package CHP_7;

public class SharonHostel extends HotelRoomArrayMethod{

    String [] rooms;
    private String studentId;
    public SharonHostel(int numberOfRooms) {
        super(numberOfRooms-1);
    }

    public String getId() {
        return studentId;
    }

    public void setId(String studentId) {
        this.studentId = studentId;
    }
    public String bookRoomWithId(String id) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = id;
                return id + ", Room Booked Successfully";
            }

        }
        return "All rooms are booked";
    }

}
