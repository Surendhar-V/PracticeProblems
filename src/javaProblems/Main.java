package javaProblems;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] res = new int[nums.length];
        int[] countArr = new int[101];

        for (int a : nums) {
            countArr[a]++;
        }

        for (int i = 1; i < countArr.length; i++) {
            countArr[i] += countArr[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            res[i] = countArr[nums[i] - 1];
        }

        return res;
    }

}