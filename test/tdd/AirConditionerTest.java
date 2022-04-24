package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {

    @Test

    public void airConditionerIsOn(){
        AirConditioner willAirConditioner = new AirConditioner();
        willAirConditioner.setOn(true);
        assertEquals(true, willAirConditioner.getSwitchOn());

    }

    @Test
    public void airConditionerIsOff(){
        AirConditioner okAirConditioner = new AirConditioner();
        okAirConditioner. setOn(false);
        assertEquals(false,okAirConditioner.getSwitchOn());

    }
    @Test
    public void airConditionerTemperatureIncrease(){
        AirConditioner fillAirConditioner = new AirConditioner();
        fillAirConditioner.increaseTemperature(true);
        assertEquals(true,fillAirConditioner.getIncreaseTemperature());
    }

    @Test
    public void airConditionerDecreaseTemperature(){

        AirConditioner aceAirConditioner = new AirConditioner();
        aceAirConditioner.increaseTemperature(false);
        assertEquals(false,aceAirConditioner.getIncreaseTemperature());
    }
    @Test
     public void airConditionerTemperatureIncreaseBeyond30(){
        AirConditioner tipAirConditioner = new AirConditioner ();
        tipAirConditioner.tipTemperature(50);
        assertEquals(30, tipAirConditioner.getOnTemperature());
    }
    @Test
    public void airConditionerTemperatureDecreaseBelow16(){
        AirConditioner wineAirConditioner = new AirConditioner();
        wineAirConditioner.tipTemperature(15);
        assertEquals(16, wineAirConditioner.getOnTemperature());
    }

    }

