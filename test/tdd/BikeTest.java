package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BikeTest{

    @Test
    public void bikeCanBeTurnedOn() {
        Bike noahBike = new Bike();
        noahBike.bikeOn(true);
        assertEquals( true, noahBike.getPowerOn());

    }

    @Test
    public void bikeCanBeTurnedOff(){

        Bike noahBike = new Bike();
        noahBike.bikeOn(false);
        assertFalse(noahBike.getPowerOn());
    }
    @Test
    public void bikeCanBeAccelerated(){         //when i have a bike
        Bike noahBike = new Bike();                 //i need a gear to power on the bike
        noahBike.bikeOn(true);
        noahBike.accelerate();
        noahBike.accelerate();
        noahBike.accelerate();
        noahBike.accelerate();
        noahBike.accelerate();
        noahBike.accelerate();
        noahBike.accelerate();
        noahBike.accelerate();
        noahBike.accelerate();
        noahBike.accelerate();
        noahBike.accelerate();
        noahBike.accelerate();
        noahBike.accelerate();
        noahBike.accelerate();
        noahBike.accelerate();
        noahBike.accelerate();
        noahBike.accelerate();
        noahBike.accelerate();
        noahBike.accelerate();
        noahBike.accelerate();
        noahBike.accelerate();
        noahBike.accelerate();


        assertEquals(25, noahBike.getSpeed());
    }

// @Test
    public void bikeCanBeDecelerated(){
        Bike noahBike = new Bike();
      //  noahBike.decelerate();
 }
    }


