package javaProblems;

import java.util.*;
class NGE {
    public static void main(String[] args) {

        int[] arr = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(solution(arr)));

    }
    private  static int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        int[] res = new int[arr.length];

        int i = 0;

        while(i<arr.length){

            if(stack.isEmpty()){
                stack.push(i);
            }else{

                while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){

                    res[stack.peek()] = arr[i];
                    stack.pop();

                }
                stack.push(i);
            }

            i++;

        }

        return res;

    }
}