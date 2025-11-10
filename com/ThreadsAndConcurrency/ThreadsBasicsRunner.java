package com.ThreadsAndConcurrency;

class Task1 extends Thread {
	
		public void run() {
			System.out.println(" " + "Task 1 Started!");
			for(int i = 101; i <= 199; i++) {
				System.out.print(i);
			}
			System.out.println("\nTask 1 Done!");
		}
	}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println(" " + "Task 2 Started!");
		for(int i = 201; i <= 299; i++) {
			System.out.print(i);
		}
		System.out.println("\nTask 2 Done!");
	}
}

class Task3 implements Runnable {

	@Override
	public void run() {
		System.out.println(" " + "Task 3 Started!");
		for(int i = 301; i <= 399; i++) {
			System.out.print(i);
		}
		System.out.println("\nTask 3 Done!");
	}
}

public class ThreadsBasicsRunner {
	
	public static void main(String[] args) throws InterruptedException  {
		//- STAGES OF THREADS THAT RUN
		//1.NEW
		//2.RUNNABLE
		//3.RUNNING
		//4.WAITING/BLOCKED
		//5.TERMINATED/DEAD
		
		//Task 1
		System.out.println("Task 1 kicked off!");
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start();

		//Task 2
		System.out.println("Task 2 kicked off!");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();
		
		//wait for task 1 to complete.
		task1.join();
		task2Thread.join();
		
		//Task 3
		System.out.println("Task 3 kicked off!");
		Task3 task3 = new Task3();
		Thread task3Thread = new Thread(task3);
		task3Thread.start();
		
	}
}
