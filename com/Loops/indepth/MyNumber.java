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

    public int sumUptoN() {
        int sum = 0;
        if (this.number <= 0 ) {
            return 0;
        }

        for (int i = 0; i <= this.number; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public int sumOfDivisors() {
        int divSum = 0;
        if (this.number <= 0) {
            return 0;
        }

        for (int i = 2; i < this.number; i++) {
            if (this.number%i == 0) {
                divSum += i;
            }
        }
        return divSum;
    }

    public void printANumberTriangle() {
        for (int i = 1; i <= this.number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

