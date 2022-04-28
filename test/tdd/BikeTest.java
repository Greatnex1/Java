package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest{

    @Test
    public void bikeCanBeTurnedOn() {
        Bike oldBike = new Bike();
        oldBike.bikeOn(true);
        assertEquals( true, oldBike.getPowerOn());

    }

    @Test
    public void bikeCanBeTurnedOff(){

        Bike joeBike = new Bike();
        joeBike.bikeOn(false);
        assertEquals(false, joeBike.getPowerOn());
    }
    @Test
    public void bikeCanBeAccelerated(){         //when i have a bike
        Bike fastBike = new Bike();                 //i need a gear to power on the bike
        fastBike.bikeAccelerates(true); //
        assertEquals(true, fastBike.getPositiveAcceleration());
    }

    }


