package com.ThreadsAndConcurrency;

import java.util.concurrent.TimeUnit;

class SleepingThread implements Runnable {

	@Override
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}