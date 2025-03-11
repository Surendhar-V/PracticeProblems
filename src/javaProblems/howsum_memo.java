package javaProblems;/*

Time complexity - O(m*n*m)

        where m is the arr.length
              n is the target sum (a in this case)


Space complexity - O(m*m)

 */



import java.util.Arrays;
import java.util.HashMap;

public class howsum_memo {

    public static void main(String[] args){

        HashMap<Integer,Integer[]> memo = new HashMap<>();
        System.out.println(Arrays.toString(sum(7, new int[]{2,3},memo)));         //true

        memo.clear();






//        System.out.println(Arrays.toString(sum(7, new int[]{5, 3, 4, 7})));   //true
        System.out.println(Arrays.toString(sum(7778, new int[]{7, 14},memo)));      //false




    }

    public static Integer[] sum(int a , int[] arr,HashMap<Integer,Integer[]> memo){



        if(memo.containsKey(a)){
            return memo.get(a);
        }
        if( a ==0)
        {
            return new Integer[]{ };
        }
        if(a<0){
            return null;
        }

        for(int i =0;i<arr.length;i++){

            Integer[] result=sum(a-arr[i],arr,memo);
            if( result!=null)
            {
                Integer[] dummy= Arrays.copyOf(result,result.length+1);
                dummy[result.length]=arr[i];
                memo.put(a,dummy);
                return memo.get(a);
            }
            else{
                memo.put(a,null);
            }

        }

        return null;


    }



}
