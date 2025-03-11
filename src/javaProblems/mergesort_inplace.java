package javaProblems;

import java.util.Arrays;

public class mergesort_inplace {

    public static void main(String[] args) {
        int[] arr = { 1 ,4,6 ,3, 8,2};
        merge(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));


    }

    public static void merge(int[] arr , int start ,int end)
    {

        if( end - start == 1  ) {

            return ;

        }
        System.out.println(start);

        int mid = ( start + end ) /2;
        merge(arr , start , mid);
        merge(arr , mid , end);

        helper(arr,start , mid , end);
    }

    public static void helper(int[] arr , int start , int mid , int end ){

        int i = start;
        int j = mid ;
        int k = 0;

        int[] mix = new int[ end - start ] ;

        while (i < mid && j< end){


            if( arr[i] < arr[ j ]){
                mix[k] =  arr[i];
                i++;

            }

            else{
                 mix[k] = arr[j];
                 j++;

            }
            k++;

        }


        while(i < mid){

            mix[k] =  arr[i];
            i++;
            k++;

        }

        while(j<end){

            mix[k] = arr[j];
            j++;
            k++;

        }


//        int m =0 ;
//        while(m != k){
//            arr[start+m] = mix[m];
//            m++;
//        }

        for (int l = 0; l < mix.length; l++) {
            arr[start+l] = mix[l];
        }

    }
}
