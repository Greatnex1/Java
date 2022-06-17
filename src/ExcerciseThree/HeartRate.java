package ExcerciseThree;

public class HeartRate {
    public static void main(String[] args) {
        Heart heartbeat = new Heart("Jane", "Fish", "January", 14, 1995 , 33, 28);
        System.out.printf("%s %s born %s %s is %d years old, ", heartbeat.getFirstName() , heartbeat.getLastName() , heartbeat.getMonth(), heartbeat. getDay() , heartbeat.getYear());
        System.out.printf(" Your maximum heartbeat rate is %d and target heart rate range is %d", heartbeat.getMaximumHeartRate() , heartbeat.getTargetRate());
    }
}
