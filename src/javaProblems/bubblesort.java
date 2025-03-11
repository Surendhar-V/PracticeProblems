package javaProblems;/*
                Intuition - The array needed to sawped according to the
                condition n-1 times and the also the outer loop should
                run for n-1 times.
                We can neglect checking the condition to the last elements,
                coz its already placed in correct position.
                So , We can make the inner loop to run arr.length-1-i .

*/

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {5,69,8,2,6,1};
        bubble(arr);
    }

    private static void bubble(int[] arr) {

        for(int i = 0; i< arr.length ;i++)
            for(int j = 0 ; j<arr.length-1-i;j++){

                if(arr[j] > arr[j+1]){
                    // swap
                    arr[j] = arr[j]^arr[j+1];
                    arr[j+1] = arr[j]^arr[j+1];
                    arr[j] = arr[j]^arr[j+1];

                    // In order to swap using bitwise XOR
                    // the elements in array should be no zero

                }

            }
        System.out.println(Arrays.toString(arr));

    }
}
