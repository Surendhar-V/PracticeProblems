package javaProblems;

public class findkthmissingnumber {

    public static void main(String[] args) {

        int[] arr = {1,2};
        int k = 1;
        System.out.println(findKthPositive(arr,k));


    }

    public static int findKthPositive(int[] arr, int k) {


        int start = 0;
        int end = arr.length-1;


        while(end >= start){

            int mid = (start+end)/2;

            if((arr[mid]-(mid+1))==0){
                start = mid+1;
            }

            else if((arr[mid]-mid+1)<=k){
                start = mid+1;
            }

            else{

                end = mid-1;

            }


        }

        if(end== arr.length-1){
            return arr[end]+k;
        }

        return end+1+k;



    }

}
