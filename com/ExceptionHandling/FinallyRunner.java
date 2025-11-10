package com.ExceptionHandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			int [] numbers = {12,2,3,4,5};
			int number = numbers[23];
			System.out.println(number);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Before Scanner closed!");
			scanner.close();
		}
		System.out.println("After the scanner is closed and closing out main!");
	}
}