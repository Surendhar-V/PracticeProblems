package javaProblems;

import java.util.Arrays;
import java.util.HashMap;

public class countingsort {
    public static void main(String[] args) {

        int[] arr=  {29,83,471,36,91,8};
        arr =countSort1(arr);

        System.out.println(Arrays.toString(arr));

    }
    private static int[] countSort1(int[] arr){

    /*

    The sorting algorithm can be also done for the negative numbers , But it might be more inefficient.
    We can achieve that by making small changes in the algorithm.
    countSort2 will be showing the algorithm based on the negative numbers using Java.HashMap.

     */

        int[] output = new int[arr.length];
        int max = Arrays.stream(arr).max().getAsInt();
        int[] count =new int[max+1];

        for(int i = 0 ; i<arr.length ; i++) {

            count[arr[i]]++;

        }

        for(int i = 1; i<count.length ; i++){

            count[i]+=count[i-1];

        }


        for(int i = arr.length-1 ; i>=0 ; i-- ){

            int idx = count[arr[i]]-1;
            output[idx] = arr[i];

        }



        return output;
    }

    private static int[] countSort2(int[] arr){

        int[] output = new int[arr.length];

        HashMap<Integer ,Integer> map = new HashMap<>();

        for(int i = 0 ; i< arr.length ; i++){

            map.put(arr[i] , map.getOrDefault(arr[i] ,0)+1);

        }

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        for(int i =min ; i <= max ; i++ ){

            

        }




        return output;
    }
}