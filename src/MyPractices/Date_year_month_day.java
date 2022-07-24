package MyPractices;

public class Date_year_month_day {

    private int year;
    private int month;
    private int day;

    public Date_year_month_day(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;


    }

    public void addDays(int days){
        this.day = days;

    }
    public  int daysTO(Date_year_month_day inTime){
        return day;
    }
    public int getYear(){
        return year;
    }

    public boolean isALeapYear(){
        if(this.year % 4 == 0){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return " " + year + "// "+ month + "//"+ day;
    }
}
