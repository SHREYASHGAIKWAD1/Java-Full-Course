package com.JavaModularization2ServiceJar.sorting.utility;

import java.util.List;

import com.sorting.algorithm.BubbleSort;

public class MySortingUtil {
	
	public List<String> sort(List<String> names) {
		BubbleSort bubbleSort = new BubbleSort();
		return bubbleSort.sort(names);
	}
}