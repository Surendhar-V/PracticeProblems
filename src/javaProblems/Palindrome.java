package javaProblems;

public class Palindrome {

    public static void main(String[] args) {

        String alpha = "MALAYALAM";

        for (int i = 0; i < (alpha.length()) / 2; i++) {

            if (alpha.charAt(i) != (alpha.charAt(alpha.length() - i - 1))) {

                System.out.println("NOT A PALINDROME");
                break;
            }

        }
    }


}

