package MyPractices;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class AirPlane {
    private String flightName;
    private  String origin;
    private int numberOfSeats;
    private int airplaneId;
    private String destination;
    private LocalDate dateOfFlight;
    private LocalTime timeOfFlight;
    private LocalTime timeOfLanding;
    private static List<Boolean> seats = new ArrayList<>();


    public AirPlane(String flightName, String origin, int numberOfSeats, int airplaneId, String destination, LocalDate dateOfFlight, LocalTime timeOfFlight, LocalTime timeOfLanding) {
        this.flightName = flightName;
        this.origin = origin;
        this.numberOfSeats = numberOfSeats;
        this.airplaneId = airplaneId;
        this.destination = destination;
        this.dateOfFlight = dateOfFlight;
        this.timeOfFlight = timeOfFlight;
        this.timeOfLanding = timeOfLanding;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getAirplaneId() {
        return airplaneId;
    }

    public void setAirplaneId(int airplaneId) {
        this.airplaneId = airplaneId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getDateOfFlight() {
        return dateOfFlight;
    }

    public void setDateOfFlight(LocalDate dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }

    public LocalTime getTimeOfFlight() {
        return timeOfFlight;
    }

    public void setTimeOfFlight(LocalTime timeOfFlight) {
        this.timeOfFlight = timeOfFlight;
    }

    public LocalTime getTimeOfLanding() {
        return timeOfLanding;
    }

    public void setTimeOfLanding(LocalTime timeOfLanding) {
        this.timeOfLanding = timeOfLanding;
    }
    @Override
    public String toString(){

        return String.format("""
                FlightName -> %s
                Origin Location -> %s
                AirplaneId -> %d
                TimeOfFLight -> %d
                Time Of Landing -> %d
              """ , flightName, origin, airplaneId, timeOfFlight, timeOfLanding );
    }
}

