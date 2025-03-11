package javaProblems;

public class dummy {

    static String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
    static String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        int num = 9999;
        compute(num);
    }

    private static void compute(int num) {

        String s = "";

    }

    private static String helper(int num, String s) {

        if (num == 0) {
            return "";
        }

        if (num < 20) {
            return (ones[num] + " " + s);
        } else {
            return (tens[num / 10] + " " + ones[num % 10] + " " + s);
        }

    }

}