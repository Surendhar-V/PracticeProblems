package javaProblems;

public class Integer2Words {

    private static final String[] arr = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] brr = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        System.out.println(Convert(9_99_99_999));
    }

    public static String Convert(long n) {

        if (n == 0) {
            return "zero";
        }

        StringBuilder s = new StringBuilder();

        s.append(helper(n / 1_00_00_000, "crore"));
        s.append(helper((n / 1_00_000L) % 100, "Lakh"));
        s.append(helper((n / 1_000L) % 100, "thousand"));
        s.append(helper((n / 100L) % 10, "hundred"));

        if (n > 100 && n % 100 != 0) {
            s.append(" and ");
        }

        s.append(helper(n % 100, ""));
        return s.toString();

    }

    private static String helper(long n, String s) {

        if (n == 0) {
            return "";
        }

        String res = "";

        if (n < 20L) {
            res = arr[(int) n] + " ";
        } else {
            res = brr[(int) n / 10] + " " + arr[(int) (n % 10)] + " ";
        }

        return res + s + " ";

    }

}