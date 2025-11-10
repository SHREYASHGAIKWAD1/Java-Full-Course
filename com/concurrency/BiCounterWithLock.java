package com.concurrency;

import java.util.concurrent.locks.*;

public class BiCounterWithLock {
	private int i = 0;
	private int j = 0;
	
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	
	public void incrementI() {
		lockForI.lock();
		i++;
		lockForI.unlock();
		//Three steps involved, not thread-safe!
		//get i
		//increment
		//set i
	}

	public int getI() {
		return i;
	}
	
	public void incrementJ() {
		lockForJ.lock();
		j++;
		lockForJ.unlock();
		//Three steps involved, not thread-safe!
		//get j
		//increment
		//set j
	}
	
	public int getJ() {
		return j;
	}
}
