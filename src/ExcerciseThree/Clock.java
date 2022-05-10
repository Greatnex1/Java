package ExcerciseThree;


public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {

    }

    public int getHour() {
        if (hour <= 23) {
            return hour;
        }
        if (hour >= 23) {
            this.hour = 0;
        }
        return hour;
    }


    public void setMinute(int minute) {
        }



    public int getMinute() {
        if (minute > 59) {
            minute = 0;
        }
        if (minute <= 59) {
            return minute;
        }
        return minute;
    }

    public void setSecond(int second){
        this.second = second;

    }

    public int getSecond() {
        if (second > 59) {
            second= 0;
        }
        if (second <= 59) {
            return second;
        }
        return second;


    }
}



