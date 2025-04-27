package javaProblems;

import java.util.Arrays;
import java.util.Collections;

public class Lexi_k {
    public static void main(String[] args) {

        int n = 6;
        int k = 5;

        if (n < k) {
            System.out.println("size of k is larger");
            return;
        }

        String[] arr = {"1","4","89","73","9","7"};

        Arrays.sort(arr, Collections.reverseOrder());

//        sortLexi(arr , 0 , arr.length);
        System.out.println(Arrays.toString(arr));

        StringBuilder res = new StringBuilder();
        String max = ((Integer) Integer.MIN_VALUE).toString();

        for(int i=0 ; i<arr.length;i++){
            String s = "";

            for(int j =0; j<arr.length ; j++){

                if(i == j){
                    continue;
                }

                if((s+arr[j]).length() > k){
                    continue;
                }

                s+=arr[j];

                max = ((Integer)Math.max(Integer.parseInt(max) , Integer.parseInt(s))).toString();

            }
        }

        System.out.println(max);



    }


    private static void sortLexi(String[] arr , int start , int end){

        if(end-start == 1){
            return;
        }

        int mid = (start + end)/2;

        sortLexi(arr , start , mid);
        sortLexi(arr , mid , end);

        mergeArr(arr , start , mid , end);


    }

    private static void mergeArr(String[] arr , int start , int mid , int end){

        String[] mix = new String[end-start];

        int i = start;
        int j = mid;

        int k = 0;

        while(i<mid && j<end){

            if(compare(arr[i] , arr[j]) == -1 ){
                mix[k++] = arr[i++];
            }else{
                mix[k++] = arr[j++];
            }

        }

        while(i<mid){
            mix[k++] = arr[i++];
        }

        while(j<end){
            mix[k++] = arr[j++];
        }

        System.arraycopy(mix, 0, arr, 0 + start, mix.length);




    }

    private static int compare(String a , String b){

        int i =0;
        int j =0;

        while(i<a.length() && j<b.length() && a.charAt(i) == b.charAt(j)){
            i++;
            j++;
        }

        if(i == a.length() && j == b.length()){
            return -1;
        }

        if(i == a.length()){
            return 1;
        }
        if(j == b.length()){
            return -1;
        }

        return (a.charAt(i) > b.charAt(j))? -1 : 1;
    }



}
