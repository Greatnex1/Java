package ExcerciseThree;

public class Heart {
  private  String firstName;
  private String lastName;
  private String month;
  private int day;
  private int year;

  private int maximumHeartRate;
  private int targetRate;




    public Heart(String firstName , String lastName, String month, int day, int year, int maximumHeartRate , int targetRate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day= day;
        this.year = year;
        this.maximumHeartRate = maximumHeartRate;
        this.targetRate = targetRate;

    }
  public void setFirstName(String firstName){

  }

  public String getFirstName() {
      return firstName;
  }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void setYear(int year) {

        this.year = year;
    }
    public int getYear() {
        int z = 2022 - year;
        return z;
    }

    public int getMaximumHeartRate() {
        if (maximumHeartRate >= 37)
              maximumHeartRate = 0;
            return maximumHeartRate;
    }
    public void setMaximumHeartRate(int maximumHeartRate) {
        this.maximumHeartRate = maximumHeartRate;
    }

    public int getTargetRate() {
        if(targetRate <= 27)
            targetRate = 0;
        return targetRate;
    }

    public void setTargetRate(int targetRate) {
        this.targetRate = targetRate;
    }
}



