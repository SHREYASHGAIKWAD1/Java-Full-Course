package com.oops;

public class Book {
    //State---------------------------------------------------------------------------------------
    private int noOfCopies; //Member variable

    //Behavior------------------------------------------------------------------------------------
    void open() {
        System.out.println("Opened the book.");
    }
    void read() {
        System.out.println("Reading the book.");
    }
    void close() {
        System.out.println("Book Closed!");
    }
    void setCopies(int copies) {  //Local variable
        if(copies > 0)
            this.noOfCopies = copies;
    }
    int getCopies() {
        return this.noOfCopies;
    }

    void increaseCopies(int incCop) {
        setCopies(this.noOfCopies + incCop);
    }

    void decreaseCopies(int decCop) {
        setCopies(this.noOfCopies - decCop);
    }
}