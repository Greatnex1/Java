package ExcerciseThree;

public class ClockTest {
    public static void main(String[] args) {
        Clock wallClock = new Clock(22, 10, 54);
        System.out.printf("%d %d %d",wallClock.getHour() , wallClock.getMinute() , wallClock.getSecond());

    }
}
