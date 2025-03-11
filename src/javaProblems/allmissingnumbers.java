package javaProblems;
/*
            IMPORTANT NOTE:

            ->  Cyclic sort can be only applicable , if the number to be sorted is in sequence.
            ->  Cyclic sort can be applicable , if there is one missing number in the sequence.
            ->  Cyclic sort can not be applicable , if there is more than one missing number unless
                 it has duplicate elements at the count of the missing numbers.
                 for example , int[] arr = {1,2,3,4,3,2,7,8};   (result of sorting...)

                 ******The resulting array will not be in sorted order.*****


INTUITION -  CYCLIC SORT is needed to be done and after that we need to linearly check whether the e
             elements are placed correctly according to the index .
             if not indexes are printed as missing numbers .


 */

import java.util.Arrays;

public class allmissingnumbers {


    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};
        findallmissingnum(arr);

    }

    private static void findallmissingnum(int[] arr) {

        //
        // cyclic sort;
        // but the result will not be a sorted array because of duplicate elements ;
        // [ 4 ,3 ,2 ,7 ,8 ,2 ,3 ,1 ] => [ 1, 2, 3, 4, 3, 2, 7, 8 ]

        int i =0;
        while(i<arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);

            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

        for(int k=0;k<arr.length;k++){
           if(arr[k]!=k+1){
               System.out.print(k+1 +"      ");
           }
        }



    }


    private static void swap(int[] arr, int first , int second){

        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
