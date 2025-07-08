package com.ConditionalIfElseAndSwitch;

import java.util.Scanner;

public class MenuRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.println("The number you entered is - " + number1 + "\n");
        System.out.print("Enter a number2: ");
        int number2 = scanner.nextInt();
        System.out.println("The number you entered is - " + number2 + "\n");
        System.out.println("Choices Available are:\n1 : Addition\n2 : Subtract\n3 : Divide\n4 : Multiply\n");
        System.out.print("Choose an operation from above: ");
        int oper = scanner.nextInt();
        System.out.println("Your choices are as follows:");
        System.out.println("Number 1 : " + number1);
        System.out.println("Number 2 : " + number2);
        System.out.println("The Operation to be performed: " + oper + "\n");

        performOperationsUsingSwitch(number1, number2, oper);
    }

    private static void performOperationsUsingSwitch(int number1, int number2, int oper) {
        switch(oper) {
            case 1:
                System.out.println("Result : " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result : " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result : " + (number1 / number2));
                break;
            case 4:
                System.out.println("Result : " + (number1 * number2));
                break;
            default:
                System.out.println("Invalid Operation!");
                break;
        }
    }


	/*private static void performOperationsUsingNestedIfElse(int number1, int number2, int oper) {
		if(oper==1) {
			System.out.println("Result : " + (number1 + number2));
		} else if (oper==2) {
			System.out.println("Result : " + (number1 - number2));
		} else if (oper==3) {
			System.out.println("Result : " + (number1 / number2));
		} else if (oper==4) {
			System.out.println("Result : " + (number1 * number2));
		}
	}*/
}
