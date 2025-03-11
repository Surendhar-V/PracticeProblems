package javaProblems;

import java.util.*;

class alternateSorting {
    public static void main(String[] args) {

        long[] arr = {7, 1, 2, 3, 4, 5, 6};

        System.out.println(alternateSort(arr, arr.length));

    }

    private static ArrayList<Long> alternateSort(long[] arr, int N) {

        Arrays.sort(arr);
        ArrayList<Long> list = new ArrayList<>();
        long max = arr[arr.length - 1] + 1;

        int left = 0;
        int right = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {

                long num = arr[right];
                if (num > max) {
                    num = num % max;
                }
                arr[i] = arr[i] + num * max;
                right--;

            } else {

                long num = arr[left];
                if (num > max) {
                    num = num % max;
                }
                arr[i] = arr[i] + num * max;
                left++;

            }

        }

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i] / max);
        }


        return list;

    }
}