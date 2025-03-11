package javaProblems;

import java.util.Arrays;
/*

INTUITION - The element should be placed in the correct order in which the correct
            order determines the position with respect to the index .

            FOR EXAMPLE  - Correct for array elements starting from 0 is  arr[i]
                           Correct for array elements starting from 1 is arr[i]-1
                           Correct for array elements starting from 7 is arr[i]-7
 */
public class cyclicsort {
    public static void main(String[] args) {

        int[] arr = { 4,3,2,7,8,5,6,1};
        cs(arr);

    }

    private static void cs(int[] arr) {
        int i =0;
        while(i<arr.length) {
            int correct = arr[i] - 1;
            // *************the important part of the cyclic sort is the condition below.***************
            if (arr[i]>0 && arr[i]<=arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }  else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr , int first , int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]=temp;
    }
}
