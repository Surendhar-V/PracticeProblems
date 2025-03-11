package javaProblems;/*
The task is we have return true when the given number is obtained if either of the elements is added

We can achieve this in many ways.
The one which is more efficient one is we have to loop the every element by subtracting it with the given number.
Until it gets Zero.
If it came Zero , return true.
If it is negative return false.

This is only applicable for the queston having this keyword,
you may use an element of the array as many times as needed.

Because it results true when the multiple of the array element is K.

 */


import java.util.HashMap;

public class cansum_memo {

    public static void main(String[] args){


        int[] arr = {2,3,5};
        int a = 8;
        HashMap<Integer,Boolean> memo = new HashMap<>();


        System.out.println(solution(7, new int[]{2, 3},memo));         //true
        memo.clear();
        System.out.println(solution(7, new int[]{5, 3, 4, 7},memo));   //true
        memo.clear();
        System.out.println(solution(7, new int[]{2, 4},memo));         //false
        memo.clear();
        System.out.println(solution(8, new int[]{2, 3, 5},memo));      //true

        memo.clear();
        System.out.println(solution(300, new int[]{7, 14},memo));      //false


    }


    public static boolean solution(int a , int[] arr ,HashMap<Integer,Boolean> memo){

        if(a==0){
            return true;
        }
        if(a<0)
        {
            return false;
        }

        if(memo.containsKey(a)){
            return memo.get(a);
        }

        for(int i = 0;i<arr.length;i++){

            if(solution(a-arr[i],arr,memo)){

                memo.put(a,true);
                return memo.get(a);
            }
            else{
                memo.put(a,false);

            }

        }
        memo.put(a,false);
        return memo.get(a);


    }
}
