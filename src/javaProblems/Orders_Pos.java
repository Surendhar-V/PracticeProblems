package javaProblems;

import java.util.Arrays;

// Odd position = Descending order
// even position = Ascending order

public class Orders_Pos {

    public static void main(String[] args) {

        int[] arr = {11,31,4,3,9};

        sort1(arr);

        sort2(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void sort1(int[] arr ){

        int n= arr.length;

        for(int i = 0 ;i < n-1 ; i+=2)
            for(int j = 0 ; j < n-2 ; j+=2){

                if(arr[j] < arr[j+2]){

                    int temp = arr[j+2];
                    arr[j+2] = arr[j];
                    arr[j] = temp;

                }

            }

    }

    public static void sort2(int[] arr){

        int n= arr.length;

        for(int i = 0 ;i < n-1 ; i+=2)
            for(int j = 1 ; j < n-2 ; j+=2){

                if(arr[j] > arr[j+2]){

                    int temp = arr[j+2];
                    arr[j+2] = arr[j];
                    arr[j] = temp;

                }

            }


    }
}