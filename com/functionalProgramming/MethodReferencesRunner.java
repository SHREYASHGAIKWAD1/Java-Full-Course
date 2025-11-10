package com.functionalProgramming;
import java.util.List;

public class MethodReferencesRunner {
	
	public static void print(int number) {
		System.out.print(number + " ");
	}

	public static void main(String[] args) {
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(e -> e.length()).forEach(s -> System.out.println(s));
		System.out.println("\n");
		//Reference method example.
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(String::length).forEach(MethodReferencesRunner::print);
		
		Integer max = List.of(23, 45, 67, 34, 500).stream().filter(MethodReferencesRunner::isEven).max(Integer::compare).orElse(0);
		System.out.println("\n" + max);
	}

	public static boolean isEven(Integer number) {
		return number%2 ==0;
	}
}
