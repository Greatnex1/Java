package CHP_8;

public class TimeFrameMain {
    public static void main(String[] args) {

        TimeFrame24 timer = new TimeFrame24(); // invokes TimeFrame constructor

        // output string representations of the time
        displayTime("After time object is created", timer);
        System.out.println();

        // change time and output updated time
        timer.setTime(13, 27, 6);
        displayTime("After calling setTime", timer);
        System.out.println();

        // attempt to set time with invalid values
        try {
            timer.setTime(99, 99, 99); // all values out of range
        }
        catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }

        // display time after attempt to set invalid values
        displayTime("After calling setTime with invalid values", timer);
    }

    // displays a TimeFrame24 object in 24-hour and 12-hour formats
    private static void displayTime(String header, TimeFrame24 t) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
                header, t.toUniversalString(), t.toString());
    }
}
