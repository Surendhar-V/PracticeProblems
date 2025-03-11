package javaProblems;

import java.util.Arrays;

public class Multiplication_without_astrisk {

    public static void main(String[] args) {

        int n = 12;

        compute(n);

    }

    private static void compute(int n) {

        int[] dp = new int[n + 1];
        Arrays.fill(dp, n);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                if (i - (j * j) >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - (j * j)] + 1);
                }
            }
        }


        System.out.println(dp[n]);
    }


}