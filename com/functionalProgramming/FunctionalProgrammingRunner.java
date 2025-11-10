package com.functionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner {
	
	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
		
		printWithFPFilter(list);
	}

	private static void printBasic(List<String> list) {
		for(String string:list) {
			System.out.println(string);
		}
	}
	
	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println("Element - " + element));
	}
	
	private static void printWithFilter(List<String> list) {
		for(String string:list) {
			if(string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}
	
	private static void printWithFPFilter(List<String> list) {
		list.stream()
		.filter(element -> element.endsWith("at"))
		.forEach(element -> System.out.println("Element - " + element));
	}
}
