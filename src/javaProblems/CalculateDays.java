package javaProblems;

public class CalculateDays {

    static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {

        int year1 = 2019;
        int month1 = 5;
        int day1 = 15;

        int year2 = 2021;
        int month2 = 5;
        int day2 = 15;

        int totalDays1 = calculateTotalDays(year1, month1, day1);
        int totalDays2 = calculateTotalDays(year2, month2, day2);

        System.out.println(totalDays1);
        System.out.println(totalDays2);

        int difference = Math.abs(totalDays1 - totalDays2);

        System.out.println("Difference between the two dates: " + difference + " days.");

    }

    public static int calculateTotalDays(int year, int month, int day) {

        int totalDays = 0;

        for (int i = 0; i < year; i++) {
            totalDays += isLeapYear(i) ? 366 : 365;
        }

        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonths[i];
        }

        if (month > 2 && isLeapYear(year)) {
            totalDays += 1;
        }

        totalDays += day;

        return totalDays;

    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

}
