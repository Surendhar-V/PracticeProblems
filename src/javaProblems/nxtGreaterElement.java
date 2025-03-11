package javaProblems;

import java.util.Arrays;
import java.util.Stack;

public class nxtGreaterElement {


    public static void main(String[] args) {

        int[] arr = {18,7,6,12,15};

        System.out.println(Arrays.toString(find(arr)));



    }


    private static int[] find(int[] arr){

        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        int[] brr = new int[arr.length];
        Arrays.fill(brr,-1);
        for(int i=1;i<arr.length;i++){

            if(arr[stack.peek()]>arr[i]){
                stack.add(i);
            }
            else if(arr[stack.peek()]<arr[i]){

                while(stack.size()>=1 && arr[stack.peek()]<arr[i]){

                    brr[stack.pop()]=arr[i];

                }
                stack.add(i);

            }


        }
        return brr;

    }

}
