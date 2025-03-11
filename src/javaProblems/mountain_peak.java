package javaProblems;

public class mountain_peak {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        /*
        {7,4,3,2,1}
        {6,7,4,2,1}
        {5,6,7,2,1}
        {4,5,6,7,1}
        */
        peak(arr);
    }
    private static void peak(int[] arr) {

    int start =0;
    int end = arr.length-1;

    while(start != end){

        int mid = (start+end)/2;

        if(arr[mid]>arr[mid+1]){
            end = mid ;                //this may be the possible ans...so "end = mid" ;
        }
        else{
            start = mid+1;
        }
    }
        System.out.println(arr[start]); // or else we can print the end also ;


    }
}
