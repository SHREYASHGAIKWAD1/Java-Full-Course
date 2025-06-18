package com.oops;

public class MotorBike {

    //State
    private int speed;

    //Behavior
    void setSpeed(int speed) {
        this.speed = speed;
        System.out.println(speed);
        System.out.println(this.speed);
    }

    void start() {
        System.out.println("Bike Started!");
    }
}
