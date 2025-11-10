package com.collections;

import java.util.*;


class AscendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}
}


public class StudentCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(10, "Shreyash"), new Student(3, "Adam"), new Student(8, "John"));
		List<Student> studentAl = new ArrayList<>(students);		
		System.out.println(studentAl);
		
		Collections.sort(studentAl);
		System.out.println("DESC- " + studentAl);
		
		//Collections.sort(studentAl, new AscendingStudentComparator());
		studentAl.sort(new AscendingStudentComparator());
		System.out.println("ASC- " + studentAl);
	}
}
