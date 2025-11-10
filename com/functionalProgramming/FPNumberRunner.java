package com.functionalProgramming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4,6,8,13,3,15);
		
		numbers.stream().forEach(element -> System.out.println(element+ " "));
		
		int sum1 = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
		
		int sumOdd = numbers.stream().filter(element -> element%2 == 1).reduce(0, (number1, number2) -> number1 + number2);
		
		int sumEven = numbers.stream().filter(element -> element%2 == 0).reduce(0, (number1, number2) -> number1 + number2);
		
		int sum = normalSum(numbers);
		System.out.println("\n" + "Sum of all numbers is " + sum);
		System.out.println("\n" + "Sum of all numbers with FP is " + sum1);
		System.out.println("\n" + "Sum of all odd numbers is " + sumOdd);
		System.out.println("\n" + "Sum of all even numbers is " + sumEven);
	}

	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for (int number:numbers) {
			sum += number;
		}
		return sum;
	}

}
