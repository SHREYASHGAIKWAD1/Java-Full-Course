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

