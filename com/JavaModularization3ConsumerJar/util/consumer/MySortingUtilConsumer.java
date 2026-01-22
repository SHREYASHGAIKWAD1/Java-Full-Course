package com.JavaModularization3ConsumerJar.util.consumer;

import java.util.List;
import java.util.logging.Logger;

import com.Sorting.Utility.MySortingUtil;

public class MySortingUtilConsumer {

	private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());
	public static void main(String[] args) {
		MySortingUtil util = new MySortingUtil();
		List<String> sorted = util.sort(List.of("Adam", "Eve", "John", "Zeve", "Steve"));
		logger.info(sorted.toString());
	}
}
