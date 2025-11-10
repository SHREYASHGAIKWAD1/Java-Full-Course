package com.ThreadsAndConcurrency;

public class PlatformThreadRunner {

	public static void main(String[] args) {
		for (var i = 1; i < 1_000_000; i++) {
			System.out.println(i);
			new Thread(new SleepingThread()).start();
		}
	}
}
