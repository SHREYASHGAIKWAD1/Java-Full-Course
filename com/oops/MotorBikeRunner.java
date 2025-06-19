package com.oops;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.start();
        honda.start();

        ducati.setSpeed(100);
        System.out.println(ducati.getSpeed());
        honda.setSpeed(80);
        System.out.println(honda.getSpeed());

        ducati.setSpeed(40);
        System.out.print("Speed now:-");
        System.out.println(ducati.getSpeed());
        honda.setSpeed(20);
        System.out.print("Speed now:-");
        System.out.println(honda.getSpeed());
    }
}
