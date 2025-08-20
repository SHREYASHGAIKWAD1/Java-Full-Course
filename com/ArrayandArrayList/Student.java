package com.ArrayandArrayList;

import java.math.*;
import java.util.*;

public class Student {

    // field
    private String name;
    private ArrayList<Integer> marks = new ArrayList<Integer>();

    // behavior
    public Student(String name, int... marks) {
        this.name = name;

        for (int mark: marks) {
            this.marks.add(mark);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return this.getMarks();
    }

    public String getNameOfTheStudent() {
        return this.name;
    }

    public int getNumberOfMarks() {
        return this.marks.size();
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for (int mark: marks) {
            sum = sum + mark;
        }
        return sum;
    }

	/*public int getMaximumMarks() {
		int maximum = Integer.MIN_VALUE;
		for (int mark: marks) {
			if (mark > maximum) {
				maximum = mark;
			}
		}
		return maximum;
	}*/

    public int getMaximumMarks() {
        return Collections.max(this.marks);
    }

	/*public int getMinimumMarks() {
		int minimum = Integer.MAX_VALUE;
		for (int mark: marks) {
			if (mark < minimum) {
				minimum = mark;
			}
		}
		return minimum;
	}*/

    public int getMinimumMarks() {
        return Collections.min(this.marks);
    }

    public BigDecimal getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();
        BigDecimal average = new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
        return average;
    }

    public String toString() {
        return name + marks;
    }

    public void addNewMark(int i) {
        this.marks.add(i);
    }

    public void removeMarkAtIndex(int i) {
        this.marks.remove(i);
    }
}

