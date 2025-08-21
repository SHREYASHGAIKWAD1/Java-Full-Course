package com.OOPSLEVEL2;

public class Employee extends Person{
    //State
    private String title;
    private String employerName;
    private char employeeGrade;
    private int salary;

    //Creation
    public Employee(String name, String title) {
        super(name);
        this.title = title;
        System.out.println("Employee Constructor");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployer() {
        return employerName;
    }

    public void setEmployer(String employer) {
        this.employerName = employer;
    }

    public char getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(char employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + " | " + title +  " | " + employerName + " | " + employeeGrade;
    }
}
