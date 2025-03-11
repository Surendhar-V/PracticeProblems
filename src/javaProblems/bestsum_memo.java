package javaProblems;/*

Time complexity  -O(n*m*m)
Space complexity -O(m*m)


where n is the arr.length
      m is the variable

*/





import java.util.Arrays;
import java.util.HashMap;

public class bestsum_memo {

    public static void main(String[] args){

        HashMap<Integer,Integer[]>memo=new HashMap<>();
        System.out.println(Arrays.toString(sum(8, new int[]{5,3,4,7},memo)));         //true
        //System.out.println(Arrays.toString(sum(5,new int[]{2,3,5})));




        memo.clear();


        // System.out.println(Arrays.toString(sum(7, new int[]{5, 3, 4, 7},memo)));   //true
        System.out.println(Arrays.toString(sum(100, new int[]{2,4,6,8,10,25},memo)));      //false




    }



    public static Integer[] sum(int a , int[] arr,HashMap<Integer,Integer[]>memo){


        if(memo.containsKey(a)){
            return memo.get(a);
        }

        if( a ==0)
        {
            return new Integer[]{};
        }
        if(a<0){
            return null;
        }

        Integer[] bestarr=null;

        for(int i =0;i<arr.length;i++){

            Integer[] result=sum(a-arr[i],arr,memo);
            if( result!=null)
            {
                Integer[] dummy= Arrays.copyOf(result,result.length+1);
                dummy[result.length]=arr[i];

                if( bestarr==null || dummy.length<bestarr.length){


                    bestarr = dummy;

                }




            }


        }

        memo.put(a,bestarr);
        return bestarr;

    }



}
