package com.firstjavaproject;

public class MultiplicationTable {
    //Multiplication Table for 5

    void print() {
        for(int i = 1; i<=10; i++) {
            System.out.printf("%d * %d = %d", 5, i, 5*i).println();
        }
    }

    void print(int num) {
        for(int i = 1; i<=10; i++) {
            System.out.printf("%d * %d = %d", num, i, num*i).println();
        }
    }

    void print(int num1, int from, int to) {
        for(int i = from; i<=to; i++) {
            System.out.printf("%d * %d = %d", num1, i, num1*i).println();
        }
    }
}
