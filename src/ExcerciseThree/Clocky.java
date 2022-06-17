package ExcerciseThree;

public class Clocky {
    public static void main(String[] args) {
        Clock wallClock = new Clock(22 , 10, 54);
        System.out.printf("The time is %d %d %d",wallClock.getHour() , wallClock.getMinute() , wallClock.getSecond());
        System.out.println(wallClock.getHour());

    }
}
