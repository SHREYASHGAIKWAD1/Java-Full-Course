package com.OOPSLEVEL2.exercises;

abstract class Animal {
	public abstract void bark();
}

class Dog extends Animal {

	@Override
	public void bark() {
		System.out.println("Dog says Woof! Woof!" + "\n");
	}
}

class Cat extends Animal {
	
	@Override
	public void bark() {
		System.out.println("Cat says Meow! Meow!" + "\n");
	}
}


public class AnimalRunner {

	public static void main(String[] args) {
		Animal[] animals = {new Dog(), new Cat()};
		
		for (Animal beings: animals) {
			beings.bark();
		}
	}

}
