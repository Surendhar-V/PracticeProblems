package javaProblems;

import java.util.Arrays;

public class Non_OverlappingIntervals {
    public static void main(String[] args) {

        int[][] arr = {{1,2},{2,3},{3,4},{1,3}};
        mergesort(arr , 0 , arr.length);
        System.out.println(Arrays.deepToString(arr));
        int count = 0;

        for(int i = 0 ; i< arr.length ; i++){

            int currEnd = arr[i][1];

            while(i+1 < arr.length && currEnd > arr[i+1][0]){

                count++;
                currEnd = Math.min(arr[i][1] , arr[i+1][1]);
                i++;

            }

        }

        System.out.println(count);

    }

    private static void  mergesort(int[][] arr , int s , int e){

        if(e - s ==1){
            return;
        }

        int m = (s+e)/2;

        mergesort(arr , s ,m);
        mergesort(arr , m , e);

        merge(arr , s , m, e);

    }

    private static void merge(int[][] arr , int s , int m , int e){

        int[][] mix = new int[e-s][2];

        int i = s;
        int j = m;

        int k = 0;


        while(i< m && j < e){

            if(arr[i][0] <= arr[j][0]){
                mix[k++] = arr[i++];
            }else{
                mix[k++] = arr[j++];
            }

        }

        while(i<m){

            mix[k++] = arr[i++];

        }
        while(j<e){

            mix[k++] = arr[j++];

        }


        System.arraycopy(mix, 0, arr, s + 0, mix.length);

    }

}