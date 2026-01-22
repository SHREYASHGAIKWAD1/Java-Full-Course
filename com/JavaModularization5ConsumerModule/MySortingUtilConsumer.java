package com.JavaModularization5ConsumerModule;

import java.util.List;
import java.util.logging.Logger;

import com.Sorting.Utility.MySortingUtil;

public class MySortingUtilConsumer {

	private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());
	public static void main(String[] args) {
		MySortingUtil util = new MySortingUtil();
		List<String> sorted = util.sort(List.of("Adam", "Eve", "John", "Zeve", "Steve"));
		logger.info(sorted.toString());
		
		//Random
		String str = """
				 line 1 %s
				  line 2 %s
				   line 3
				    line 4
				     line 5
				""".formatted("Some Value", "Some other value");
		System.out.println(str);
	}
}
