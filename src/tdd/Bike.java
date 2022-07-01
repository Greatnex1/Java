package tdd;

public class Bike {

    public void bikeOn(boolean on) {
        powerIsOn = on;
    }

    private boolean powerIsOn;
    private int speed = 0;
    private int gear;

    public boolean getPowerOn() {
        return powerIsOn;

    }

    public void bikeAccelerates(boolean acceleration) {
        positive = acceleration;
    }

    private boolean positive;

    public boolean getPositiveAcceleration() {
        return positive;
    }


    public void accelerate() {

        if (speed >= 0 && speed <= 20) speed = speed + 1;

        if (speed > 20 && speed <= 30) {
            speed = speed + 2;
        }
        if (speed > 30 && speed <= 40) {
            speed = speed + 3;
        }
        if (speed > 40) {
            this.speed = speed + 4;
        }

    }

    public int getSpeed() {
        return speed;
    }
    public int getGear(){
        return gear;
    }

    public void deceleration() {
        if (speed == 0) {
            gear = 0;
        }

        if (speed > 0) {
            if (speed < 21) {
                this.speed = speed - 1;
                gear = 1;


            }
        }
        if (speed > 20) {
            if (speed < 31) {
                this.speed = speed - 2;
                gear = 2;

            }
        }
        if (speed > 30) {
            if (speed < 41) {
                this.speed = speed - 3;
                gear = 3;


            }
        }
        if (speed > 40) {
            this.speed = speed - 4;
            gear = 3;

        }
    }
}