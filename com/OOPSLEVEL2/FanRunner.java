package com.OOPSLEVEL2;

public class FanRunner {

    public static void main(String[] args) {
        Fan fan = new Fan("Manufacturer 1", 1.342, "Brown");
        fan.switchOn();
        System.out.println(fan);
        fan.setSpeed((byte)3);
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
        fan.switchOn();
        System.out.println(fan);
    }
}
