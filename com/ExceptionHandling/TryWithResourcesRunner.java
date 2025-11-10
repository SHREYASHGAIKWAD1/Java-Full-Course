package com.ExceptionHandling;

import java.util.Scanner;

public class TryWithResourcesRunner {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {;
			int [] numbers = {12,2,3,4,5};
			int number = numbers[23];
			System.out.println(number);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Before Scanner closed!");
		}
		System.out.println("After the scanner is closed and closing out main!");
	}
}