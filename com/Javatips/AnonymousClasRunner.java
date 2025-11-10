package com.Javatips;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LengthComparator implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		return Integer.compare(str2.length(), str1.length());
	}
	
}

public class AnonymousClasRunner {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(List.of("Ant", "Ball", "Cat", "Elephant"));
		//Collections.sort(list, new LengthComparator());
		Collections.sort(list,                                           //Instead of using LengthComparator class, we use Anonymous class!
				new Comparator<String>() {

					@Override
					public int compare(String str1, String str2) {
						return Integer.compare(str2.length(), str1.length());
					}
		});
		System.out.println(list);
	}

}
