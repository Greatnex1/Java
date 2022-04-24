package tdd;

public class AirConditioner {

    public void setOn(boolean on) {
        switchIsOn = on;

    }

   private boolean switchIsOn;
    public boolean getSwitchOn() {
        return switchIsOn;
    }

    public void increaseTemperature(boolean temperature) {
        increaseTemperature = temperature;
    }

    private boolean increaseTemperature;


    public boolean getIncreaseTemperature() {
        return increaseTemperature;
    }


    public void tipTemperature(int temperature) {
        if (temperature > 30) {
            on = 30;
        }
        if (temperature < 16) {
            on = 16;
        }
    }

        private int on;


    public int getOnTemperature() {
        return on;
    }
    }


