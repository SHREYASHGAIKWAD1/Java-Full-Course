package com.JavaModularization5ConsumerModule;

import java.util.List;
import java.util.logging.Logger;

import com.Sorting.Algorithm.BubbleSort;
import com.Sorting.Utility.MySortingUtil;

public class DirectConsumer {

	private static Logger logger = Logger.getLogger(DirectConsumer.class.getName());
	public static void main(String[] args) {
		BubbleSort util = new BubbleSort();
		List<String> sorted = util.sort(List.of("Adam", "Eve", "John", "Zeve", "Steve"));
		logger.info(sorted.toString());
	}
}
