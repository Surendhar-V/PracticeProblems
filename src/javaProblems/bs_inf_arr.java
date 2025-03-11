package javaProblems;/*

INTUITION - We will be given an infinite array.
            The intuition is we search for the element chunk by chunk.
            As it is sorted , if the element at last is smaller than the target element, It is obvious that there will not be the presence of the target.
            Hence, we move to the next chunk.
            The size of the chunk will be increased exponentially.

 */

public class bs_inf_arr {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //consider this as infinite array.
        // we are not going to use arr.length for end in binary search
        int search = 19;
        chuncks(arr,search);

    }
    private static void chuncks(int[] arr, int search) {
        int start = 0;
        int size =1;
        int end = start + size;

        while(arr[end]<search)
        {
                start=end+1;
                size = size * 2;
                end = start+size;

        }
        System.out.println(start + "   "+end);
        bs(arr , search,start,end);


    }

    public static void bs(int[] arr , int search,int start , int end)
    {
        int ans =-1;
        while(start<=end){

            int mid = (start+end)/2;

            if (search>arr[mid]){
                start = mid + 1;
            }

            else if(arr[mid] > search){
                end = mid -1 ;
            }

            else{
                ans = mid;
                break;
                            }

        }
        System.out.println(ans);

    }

}
