package javaProblems;

import java.util.ArrayDeque;

public class MaximumSlidingWindow{
    public static void main(String[] args) {

        int[] arr = {1,3,5,2,1,8,6,9};
        int k = 3;
        helper(arr ,k);
    }

    private static void helper(int[] arr , int k){

        ArrayDeque<Integer> window = new ArrayDeque<>();

        int i=0;

        for(;i<k;i++){
            while(!window.isEmpty() && arr[window.getLast()] <= arr[i]){
                window.removeLast();
            }
            window.addLast(i);
        }

        int n = arr.length;

        for(;i<n;i++){
            System.out.print(arr[window.getFirst()]+" ");
            if(!window.isEmpty() && window.getFirst() < i-k+1){
                window.removeFirst();
            }
            while( !window.isEmpty() && arr[window.getLast()] <= arr[i] ){
                window.removeLast();
            }
            window.addLast(i);
        }
        System.out.println(arr[window.getFirst()]);
    }
}