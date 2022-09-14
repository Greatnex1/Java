package MyPractices.Comparables;

public class CalenderDate implements Comparable<CalenderDate> {
    //    This program  store / reads only months and day in a year
    private int month;
    private int day;

    private String name;

    public CalenderDate(String name, int month, int day) {
        this.name = name;
        this.month = month;
        this.day = day;
    }

    @Override
    public int compareTo(CalenderDate other) {
//        if (month < other.month) {
//            return -1;
//        } else if (month == other.month){
//            return 0;
//        } else {
//            return 1;
//        }
        if (month != other.month) {
            return month - other.month;
        } else {
            return day - other.day;
        }

    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return  day;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return name +": " + "/ " + month + "/ " + day;
    }
}
