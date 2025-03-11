package javaProblems;/*

INTUITION - Here in this algorithm , we fix the range ( initially the first element ) in which it is considered sorted
            and the next element to the range is considered as k ( element to be inserted into the sorted range ) .
            This will be continued this the range of arr.length-2 .

 */


import java.util.Arrays;
public class insertionsort{
    public static void main(String[] args){
        int[] arr = {5,3,4,1,2};
        int n =5;
        is(arr,n);

    }

    public static void is(int[] arr, int n){

        for(int i =0;i<n-1;i++){

            int j=i+1;
            while(j>0){
                if(arr[j] < arr[j-1]){
                    swap(arr , j , j-1 );
                    j--;
                }
                else{
                    break;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        System.out.println(Arrays.toString(arr));

    }





    public static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}

