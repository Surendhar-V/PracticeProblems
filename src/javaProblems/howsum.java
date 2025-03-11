package javaProblems;/*

Time complexity - O(m^n * m)

        where m is the arr.length
              n is the target sum (a in this case)


Space complexity - O(m)

 */



import java.util.Arrays;


public class howsum {

    public static void main(String[] args){


        System.out.println(Arrays.toString(sum(7, new int[]{5,3,4,7})));         //true



    //        System.out.println(Arrays.toString(sum(7, new int[]{5, 3, 4, 7})));   //true
    //    System.out.println(Arrays.toString(sum(7778, new int[]{7, 14})));      //false




    }

    public static Integer[] sum(int a , int[] arr){


        if( a ==0)
        {
            return new Integer[]{ };
        }
        if(a<0){
            return null;
        }

        for(int i =0;i<arr.length;i++){

            Integer[] result=sum(a-arr[i],arr);
            if( result!=null)
            {
                Integer[] dummy= Arrays.copyOf(result,result.length+1);
                dummy[result.length]=arr[i];

                return dummy;
            }


        }

        return null;


    }



}
