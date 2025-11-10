package com.concurrency;

public class BiCounter {
	private int i = 0;
	private int j = 0;
	
	synchronized public void incrementI() {
		i++;
		//Three steps involved, not thread-safe!
		//get i
		//increment
		//set i
	}

	public int getI() {
		return i;
	}
	
	synchronized public void incrementJ() {
		j++;
		//Three steps involved, not thread-safe!
		//get j
		//increment
		//set j
	}
	
	public int getJ() {
		return j;
	}
}
