package com.ThreadsAndConcurrency;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableRunner2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService exeSer = Executors.newFixedThreadPool(3);
		
		List<CallableTask> tasks = List.of(new CallableTask(" Java"), new CallableTask(" Shreyash"), new CallableTask(" Adam"));
		
		String result = exeSer.invokeAny(tasks);
		
		System.out.println(result);
		exeSer.shutdown();
	}
}
