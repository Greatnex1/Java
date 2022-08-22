package CHP_7;

public class HotelRoomArrayMethod {
    private String[] rooms;

    public HotelRoomArrayMethod(int numberOfRooms) {
        this.rooms = new String[numberOfRooms];
    }

    public String[] getRooms() {
        return rooms ;


    }

    public String bookRoom(String name) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = name;
                return name + ", Room Booked Successfully";
            }

        }
        return "All rooms are booked";
    }

    public String getGuest(int roomNumber) {
        return rooms [roomNumber-1];
    }

    public void checkout(int roomNumber) {
        rooms [roomNumber -1] = null;
    }

}