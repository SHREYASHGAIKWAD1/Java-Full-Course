package com.oops;

public class MotorBikeRunner {

    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike(200);
        MotorBike bmw = new MotorBike();

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
        System.out.println(bmw.getSpeed());

        ducati.start();
        honda.start();

        ducati.setSpeed(100);
        System.out.println(ducati.getSpeed());
        honda.setSpeed(80);
        System.out.println(honda.getSpeed());

        ducati.increaseSpeed(100);
        System.out.println(ducati.getSpeed());

        honda.increaseSpeed(100);
        System.out.println(honda.getSpeed());

        int ducatiSpeed = ducati.getSpeed();
        ducatiSpeed += 100;
        ducati.setSpeed(ducatiSpeed);

        int hondaSpeed = honda.getSpeed();
        hondaSpeed += 100;
        honda.setSpeed(hondaSpeed);
        System.out.println(honda.getSpeed());

        ducati.decreaseSpeed(310);
        System.out.println(ducati.getSpeed());

        //ducati.setSpeed(40);
        //System.out.print("Speed now:- ");
        //System.out.println(ducati.getSpeed());
        //honda.setSpeed(20);
        //System.out.print("Speed now:- ");
        //System.out.println(honda.getSpeed());
    }

}
