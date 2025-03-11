package javaProblems;// We need to do both the traversal(from right to left and left to right)
// Only after that we will reduce the string

public class Invalid_Prarathesis {

    public static void main(String[] args) {

        String s = "()()()";

        System.out.println(helper(s));

    }

    private static String helper(String s) {

        int temp = 0;

        // left to right

        int[] n = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                temp++;
            } else {
                temp--;
            }

            if (temp < 0) {
                n[i] = -1;
                temp = 0;
            }

        }

        for (int i = 0; i < n.length; i++) {
            if (n[i] == -1) {
                return makeString(s , n);
            }
        }

        temp = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == ')') {
                temp++;
            } else {
                temp--;
            }

            if (temp < 0) {
                n[i] = -1;
                temp = 0;
            }

        }

        return makeString(s , n);

    }

    private static String makeString(String s , int[] n) {

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (n[i] == -1) {
                continue;
            } else {
                res.append(s.charAt(i));
            }

        }

        return res.toString();
    }
}