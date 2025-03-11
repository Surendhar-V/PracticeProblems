package javaProblems;/*

INTUITION - Here we use the cyclic sort and at last we can check whether all elements are placed correctly and the missplaced element is the missing positive number.

 */


import java.util.Arrays;
// find the smallest missing positive number;

public class MissingPositive {
    public static void main(String[] args) {

        int[] arr = {3,4,-1,1};
        find((arr));

    }

    private static void find(int[] arr) {
        int i =0;
        while(i<arr.length) {
            int correct = arr[i] - 1;

            if (arr[i]>0 && arr[i]<=arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }  else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

        for(int k=0 ; k<arr.length;k++){
            if(arr[k] != k+1 ){
                System.out.println(k+1);
            }
        }

    }

    private static void swap(int[] arr , int first , int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]=temp;
    }
}
