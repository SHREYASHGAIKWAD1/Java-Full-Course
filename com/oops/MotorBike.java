package com.oops;

public class MotorBike {

    //State
    private int speed;

    //Behavior

    void start() {
        System.out.println("Bike Started!");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed > 0)
            this.speed = speed;
    }
}
