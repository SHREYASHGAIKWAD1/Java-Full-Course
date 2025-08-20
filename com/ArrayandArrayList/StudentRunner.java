package com.ArrayandArrayList;

import java.math.BigDecimal;

public class StudentRunner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student student = new Student("Shreyash Gaikwad", new int[] {99, 97, 98, 95, 94});
        Student student1  = new Student("Shrushti Gaikwad", new int[] {10, 20, 3, 45, 53});
        Student student2  = new Student("karuna Jadhav", new int[] {10, 20, 3, 45, 53});
        int number = student.getNumberOfMarks();
        System.out.println("Number of marks of the student: " + number);
        int sum = student.getTotalSumOfMarks();
        System.out.println("Total sum of the marks : " + sum);
        String studentName = student.getNameOfTheStudent();
        System.out.println("Name of the student is " + studentName.toUpperCase());
        int maximumMarks = student.getMaximumMarks();
        System.out.println("Maximum marks the student got is " + maximumMarks);
        int minimumMarks = student.getMinimumMarks();
        System.out.println("The minimum marks student got is " + minimumMarks);
        BigDecimal average = student.getAverageMarks();
        System.out.println("The average of all marks is " + average);
        System.out.println(student);
        student.addNewMark(92);
        student.removeMarkAtIndex(4);
        System.out.println(student);
    }
}
