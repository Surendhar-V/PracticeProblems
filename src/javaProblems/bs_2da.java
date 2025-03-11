package javaProblems;

import java.util.Arrays;

public class bs_2da {

    public static void main(String[] args) {

        int[][] arr = {

                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };
        int target = 20;
        System.out.println(Arrays.toString( BinarySearch_2d(arr , target)));





    }

    private static int[] BinarySearch_2d(int[][] arr, int target) {

        if(arr.length == 1){
            return bs_1d(arr,0,0,arr.length-1,target);
        }

        int Cmid = (arr[0].length-1)/2;
        int Rstart = 0;
        int REnd = arr.length-1;


        while(REnd-Rstart != 1){

            int Rmid = (Rstart+REnd)/2;

            if(arr[Rmid][Cmid] == target){
                return new int[]{ Rmid , Cmid };
            } else if (arr[Rmid][Cmid] > target) {
                REnd = Rmid;
            }
            else {
                Rstart = Rmid;
            }

        }

        if( arr[Rstart][Cmid] == target ){
            return new int[]{ Rstart , Cmid};
        }
        if( arr[REnd][Cmid] == target ) {
            return new int[] {REnd ,Cmid};
        }



        if( arr[Rstart][Cmid-1] >= target){
            return  bs_1d(arr , Rstart , 0 , Cmid-1 , target);
        }
        if( arr[Rstart][arr[0].length-1] >= target)
        {
            return bs_1d(arr , Rstart , Cmid+1 , arr[0].length-1 , target);
                    }

        if( arr [ REnd][Cmid-1] >= target){
            return bs_1d(arr , REnd , 0 , Cmid-1 , target);
        }
        if( arr[REnd][arr[0].length-1] >= target){
            return  bs_1d(arr , REnd , Cmid+1 , arr[0].length-1 , target);
        }

        return new int[]{-1 , -1};
    }

    private static int[] bs_1d(int[][] arr , int row , int start , int end , int target ) {



        while(start<=end) {

            int mid = (start + end) / 2;

            if(arr[row][mid] == target){
                return new int[]{row , mid};
            }
            if(arr[row][mid] < target)
            {
                start = mid+1;
            }
            else {
                end = mid -1;
            }

        }
        return new int[]{-1,-1};

    }


}
