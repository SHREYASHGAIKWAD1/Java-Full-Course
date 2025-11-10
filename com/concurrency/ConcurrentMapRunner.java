package com.concurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {
		Map<Character, LongAdder> occurances1 = new Hashtable<>();
		String str = "ABCD ABCD ABCD ";
		
		/*for (char character:str.toCharArray()) {
			LongAdder longAdder = occurances1.get(character);
			if(longAdder == null) {
				longAdder = new LongAdder();
			}
			longAdder.increment();
			occurances1.put(character, longAdder);
		}
		System.out.println(occurances1);*/
		
		ConcurrentHashMap<Character, LongAdder> occurances = new ConcurrentHashMap<>();
		for (char character:str.toCharArray()) {
			occurances.computeIfAbsent(character, ch -> new LongAdder()).increment();
		}
		System.out.println(occurances);
	}
}
