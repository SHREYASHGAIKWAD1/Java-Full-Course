package com.OOPSLEVEL2.exercises;

interface Flyable {
	public void fly();
}

class Bird implements Flyable {
	
	@Override
	public void fly() {
		System.out.println("Flies with Wings!");
	}
}

class Aeroplane implements Flyable {
	
	@Override
	public void fly() {
		System.out.println("Flies with Fuel!");
	}
}


public class FlyableRunner {
	
	public static void main(String[] args) {
		Flyable[] flyingObjects = {new Bird(), new Aeroplane()};
		
		for(Flyable objects: flyingObjects) {
			objects.fly();
		}
	}

}
