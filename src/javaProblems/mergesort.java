package javaProblems;

import java.util.Arrays;
/*

INTUITION  - The intuition for this type of sorting algorithm is we have to spilt the array element until the array reach to single element
             and merge correspondingly in the order we need.

NOTE -  BELOW CODE IS NOT  IN-PLACE SORTING.



 */
class mergesort {

    public static void main(String[] args) {

        int[] arr = {4,5,3,2,1,98};

        System.out.println(Arrays.toString(sort(arr)));


    }


    private static int[] sort(int[] arr){

        int mid = arr.length/2;
        if(arr.length == 1){
            return arr ;
        }

        int[] left = sort(Arrays.copyOfRange(arr , 0 , mid));
        int[] right = sort(Arrays.copyOfRange(arr,mid , arr.length));

        return merge(left , right);

    }

    public static int[] merge(int[] first , int[] second){

        int i =0;
        int j =0;
        int k =0;
        int[] mix =new  int[first.length + second.length];

        while(i<first.length && j<second.length){

            if(first[i] < second[j]){

                mix[k] = first[i];
                i++;
                k++;
            }
            else{

                mix[k] =second[j];
                j++;
                k++;

            }

        }

        // filling remaining elements of first array to mix

        while(i<=first.length-1){
            mix[k] = first[i];
            k++;
            i++;
        }


        // filling remaining elements of second array to mix

        while(j<=second.length-1){
            mix[k] = second[j];
            k++;
            j++;
        }

        return mix;


    }

}
