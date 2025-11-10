package com.concurrency;

public class Counter {
	private int i = 0;
	
	synchronized public void increment() {
		i++;
		//Three steps involved, not thread-safe!
		//get i
		//increment
		//set i
	}

	public int getI() {
		return i;
	}
}
