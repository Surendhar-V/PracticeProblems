package javaProblems;/*

Time complexity  -O(n^m*m)
Space complexity -O(m*m)


where n is the arr.length
      m is the variable
 
*/





import java.util.Arrays;
public class bestsum {

    public static void main(String[] args){


        System.out.println(Arrays.toString(sum(8, new int[]{5,3,4,7})));         //true
        //System.out.println(Arrays.toString(sum(5,new int[]{2,3,5})));







        // System.out.println(Arrays.toString(sum(7, new int[]{5, 3, 4, 7},memo)));   //true
        //System.out.println(Arrays.toString(sum(777, new int[]{7, 14})));      //false




    }



    public static Integer[] sum(int a , int[] arr){




        if( a ==0)
        {
            return new Integer[]{};
        }
        if(a<0){
            return null;
        }

        Integer[] bestarr=null;

        for(int i =0;i<arr.length;i++){

            Integer[] result=sum(a-arr[i],arr);
            if( result!=null)
            {
                Integer[] dummy= Arrays.copyOf(result,result.length+1);
                dummy[result.length]=arr[i];

                if( bestarr==null || dummy.length<bestarr.length){


                    bestarr = dummy;

                }




            }


        }

        return bestarr;

    }



}
