package com.ConditionalIfElseAndSwitch;

import java.util.Scanner;

public class SwitchExercisesRunner {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Day Number: ");
		int dayNumber = scanner.nextInt();

        System.out.println(determineNameofDay(0));
        System.out.println(determineNameofMonth(8));
        System.out.println(isWeekDay(3));
    }

    public static boolean isWeekDay(int dayNumber) {
        switch (dayNumber) {
            case 0:

            case 6:
                return false;
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
                return true;
        }

        return false;
    }


    public static String determineNameofDay(int dayNumber) {
        String result = "";
        switch (dayNumber) {
            case 0:
                result = "Sunday";
                break;
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
        }
        return result;
    }


    public static String determineNameofMonth(int monthNumber) {
        switch (monthNumber) {
            case 0: return "January";
            case 1: return "February";
            case 2: return "March";
            case 3: return "April";
            case 4: return "May";
            case 5: return "June";
            case 6: return "July";
            case 7: return "August";
            case 8: return "September";
            case 9: return "October";
            case 10: return "November";
            case 11: return "December";
        }
        return "Invalid input!";
    }
}