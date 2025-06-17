package com.oops;

public class Book {
    //State
    int noOfCopies;

    //Behavior
    void open() {
        System.out.println("Opened the book.");
    }
    void read() {
        System.out.println("Reading the book.");
    }
    void close() {
        System.out.println("Book Closed!");
    }

    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book();
        Book effectiveJava = new Book();
        Book cleanCode = new Book();

        artOfComputerProgramming.open();
        artOfComputerProgramming.read();
        artOfComputerProgramming.close();

        artOfComputerProgramming.noOfCopies = 50;
        effectiveJava.noOfCopies = 80;
        cleanCode.noOfCopies = 70;
    }

}
