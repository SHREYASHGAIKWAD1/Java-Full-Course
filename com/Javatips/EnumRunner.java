package com.Javatips;

import java.util.Arrays;

enum Season {
	WINTER(1), SUMMER(2), SPRING(3), FALL(4);
	
	//In order to store enums in database we'll have create a constructor for the same!
	private int value;
	
	private Season(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}

public class EnumRunner {
	public static void main(String[] args) {
		Season season = Season.FALL;
		Season season1 = Season.valueOf("WINTER");
		Season season2 = Season.SUMMER;
		System.out.println(season1);
		System.out.println(season1.name());
		System.out.println(season1.getClass());
		System.out.println(season1.ordinal());
		System.out.println(season1.SPRING.ordinal());
		System.out.println(season.name() + " : " + season.ordinal());
		System.out.println(Arrays.toString(Season.values()));
		
		System.out.println("Summer Ordinal : " + season2.getValue());
	}
}
