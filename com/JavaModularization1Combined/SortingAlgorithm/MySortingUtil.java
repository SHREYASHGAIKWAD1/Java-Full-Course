package com.JavaModularization1Combined.SortingAlgorithm;

import java.util.List;

import com.Sorting.Algorithm.BubbleSort;

public class MySortingUtil {
	
	public List<String> sort(List<String> names) {
		BubbleSort bubbleSort = new BubbleSort();
		return bubbleSort.sort(names);
	}
}