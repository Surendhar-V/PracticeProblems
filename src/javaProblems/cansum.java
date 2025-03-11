package javaProblems;


public class cansum {

    public static void main(String[] args){




        System.out.println(solution(7, new int[]{2, 3}));         //true

        System.out.println(solution(7, new int[]{5, 3, 4, 7}));   //true

        System.out.println(solution(7, new int[]{2, 4}));         //false

        System.out.println(solution(8, new int[]{2, 3, 5}));      //true


        System.out.println(solution(300, new int[]{7, 14}));      //false


    }
    public static boolean solution(int a , int[] arr ){

        if(a==0){
            return true;
        }
        if(a<0)
        {
            return false;
        }



        for(int i = 0;i<arr.length;i++){

            if(solution(a-arr[i],arr)){


                return true;
            }

        }

        return false;


    }


}
