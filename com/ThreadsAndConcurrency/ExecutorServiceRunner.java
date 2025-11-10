package com.ThreadsAndConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	private int number;
	
	public Task(int number) {
		this.number = number;
	}
	
	public void run() {
		System.out.println(" " + number + " Task Started!");
		for(int i = number*100; i <= number*100+99; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask " + number + " Done!");
	}
}

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		//ExecutorService executor = Executors.newSingleThreadExecutor();
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(new Task(1));
		executor.execute(new Task(2));
		executor.execute(new Task(3));
		executor.execute(new Task(4));
		executor.execute(new Task(5));
		executor.execute(new Task(6));
		executor.execute(new Task(7));
		executor.shutdown();
		
		
		/*executor.execute(new Task1());
		executor.execute(new Task2());
		System.out.println("\n" + " " + "Task 3 Started!");
		for(int i = 301; i <= 399; i++) {
			System.out.print(i);
		}
		System.out.println("\nTask 3 Done!");
		System.out.println("Main Done!");*/
	}

}
