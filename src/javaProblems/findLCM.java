package javaProblems;

import java.util.Arrays;

public class findLCM {

    public static void main(String[] args) {

        Integer[] arr = {2 , 7 , 3 , 9 , 4};

        int res = Arrays.stream(arr).reduce(1 , (a , b) -> a * b / GCD(a , b));
        System.out.println(res);

    }

    private static int GCD(int a , int b) {

        if (b == 0) {
            return a;
        }

        return GCD(b , a % b);

    }

}
