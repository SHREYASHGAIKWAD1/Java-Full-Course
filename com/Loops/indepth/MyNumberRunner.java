package com.Loops.indepth;

public class MyNumberRunner {

    public static void main(String[] args) {
        MyNumber number = new MyNumber(1);
        boolean isPrime = number.isPrime();
        System.out.println("IsPrime : " + isPrime);
        int sum = number.sumUptoN();
        System.out.println("Sum of all numbers upto N is " + sum);
        int sumOfDivisors = number.sumOfDivisors();
        System.out.println("Sum of all divisors for N is " + sumOfDivisors);
        number.printANumberTriangle();
    }
}