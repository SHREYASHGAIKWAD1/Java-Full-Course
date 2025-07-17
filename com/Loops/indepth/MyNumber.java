package com.Loops.indepth;

public class MyNumber {
    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        if (this.number < 2) {
            return false;
        }

        for (int i = 2; i < this.number - 1; i++) {
            if (this.number%i == 0) {
                return false;
            }
        }

        return true;
    }