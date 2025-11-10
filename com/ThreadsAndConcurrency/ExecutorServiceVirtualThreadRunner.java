package com.ThreadsAndConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceVirtualThreadRunner {

	public static void main(String[] args) {
		ExecutorService exe = Executors.newVirtualThreadPerTaskExecutor();
		
		for (var i = 1; i < 1_000_000; i++) {
			System.out.println(i);
			//Thread.startVirtualThread(new SleepingThread());
			//Thread.ofVirtual().start(new SleepingThread());
			exe.execute(new SleepingThread());
		}
		exe.shutdown();
	}

}
