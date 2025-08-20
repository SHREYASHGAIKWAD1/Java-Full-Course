package com.ArrayandArrayList;

public class StringRunner {

    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};

        String dayWithMostCharacters = "";
        for (String day: daysOfWeek) {
            if (day.length() > dayWithMostCharacters.length()) {
                dayWithMostCharacters = day;
            }
        }
        System.out.println("This is day in the week with most characters: " + dayWithMostCharacters);

        for (int i = daysOfWeek.length - 1; i >= 0; i--) {
            System.out.print(daysOfWeek[i] + " ");
        }
    }

}
