package com.oops;

public class Book {
    //State
    private int noOfCopies;

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
    void setCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book();
        Book effectiveJava = new Book();
        Book cleanCode = new Book();

        artOfComputerProgramming.open();
        artOfComputerProgramming.read();
        artOfComputerProgramming.close();

        artOfComputerProgramming.setCopies(50);
        effectiveJava.setCopies(80);
        cleanCode.setCopies(70);
    }
}