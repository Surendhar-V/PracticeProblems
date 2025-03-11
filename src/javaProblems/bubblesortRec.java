package javaProblems;/*

INTUITION- (sort_a) ->  At first row number will be given the arr.length-1 , and it is decreased of every recursive calls .
                        Once col variable reaches the above the row number , It will take a another recursive call with row-1 and col = 0 ;

 */


import java.util.Arrays;

public class bubblesortRec {

    public static void main(String[] args) {

        int[] arr = {1, 6, 3, 8, 4};
        int r =  0;
        int c = 0;
        //sort(arr, r, c , arr.length -1 );
        sort_a(arr , arr.length-1 , 0);
        //System.out.println(Arrays.toString( arr));
        System.out.println(Arrays.toString(arr));


    }


    public static void sort(int[] arr, int r, int c, int n ) {


        if( c == n){

            return;
        }

        if( arr[c] < arr[c+1]){


            swap(arr , c , c+1);
        }

        sort( arr , r , c+1 , n);
        sort( arr , r+1 , 0 , n-1);

    }

    public static void sort_a(int[] arr , int r , int c){


        if( r == 0 ){
            return;
        }


        if( c < r ) {

            if( arr[c] < arr[c+1]){


                swap(arr , c , c+1);

            }


            sort_a(arr, r, c + 1);

        }
        else sort_a( arr , r-1 , 0);

    }

    public static  void swap(int[] arr , int i , int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;


    }

}