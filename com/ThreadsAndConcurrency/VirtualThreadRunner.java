package com.ThreadsAndConcurrency;

public class VirtualThreadRunner {

	public static void main(String[] args) {
		for (var i = 1; i < 1_000_000; i++) {
			System.out.println(i);
			Thread.startVirtualThread(new SleepingThread());
			//Thread.ofVirtual().start(new SleepingThread());
		}
	}

}
