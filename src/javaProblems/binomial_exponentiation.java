package javaProblems;/*

INTUITION - If the power is odd we save the base by multiplying it in a variable  and power is reduced by one
            If the power is even we multiply the base and base and the power will become power/2;
            This operation will be done till the power gets to ZERO

 */

public class binomial_exponentiation {
    public static void main(String[] args) {
        power(2, -10);
    }

    private static void power(double x, int n) {
        double ans = 1.0;
        long nn = n;
        if ((nn < 0)) {
            nn *= -1;
        }

        while (nn > 0) {
            if (nn % 2 == 0) {
                x = x * x;
                nn = nn / 2;
            } else {
                ans = ans * x;
                nn = nn - 1;
            }
        }

        System.out.println((n < 0) ? Double.toString(1.0 / ans) : ans);


    }


}
