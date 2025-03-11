package javaProblems;

import java.util.*;
public class Increasing_Chain {

    private static final ArrayList<Integer> a = new ArrayList<>();
    private  static  int k  = 0 ;
    public static void main(String[] args)
    {


        int[] arr = {10,11,4,3,8,9};
        int count = 0;
        int i =0 ;
        function (arr , i ,i+1, count );
        System.out.println(a);

    }

    private static void function(int[] arr ,int  i ,int j , int count) {


        if( i == arr.length || j == arr.length){
            k++;

            a.add(count+1);
            return;
        }


        if(arr[i] < arr[j]){
            count++;

            function(arr , j,j+1,count);



        }
        else{
            function (arr , i,j + 1 , count);

        }
        if(k < arr.length) {
            count = 0;
            function(arr, k , k+1, count);
        }
        else {

        }
    }



}