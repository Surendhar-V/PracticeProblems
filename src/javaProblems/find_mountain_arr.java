package javaProblems;

/*

 INTUITION - The mountain array simply means that the one side of the array is in one order and another side is in opposide order.
              so we can implement both ascending order and descending order after finding the peak element.

 */
public class find_mountain_arr {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int peak=peak(arr);

        int search = 2;
        int[] pos = {-1,-1};
        pos[0] = bs_a(arr,search,peak);
        pos[1] = bs_d(arr,search,peak+1);

        System.out.println(pos[0]+"  "+pos[1]);

    }
    public static int peak(int[] arr) {

        int start =0;
        int end = arr.length-1;

        while(start != end){

            int mid = (start+end)/2;

            if(arr[mid]>arr[mid+1]){
                end = mid;                //this may be the possible ans...so "end = mid" ;
            }
            else{
                start = mid+1;
            }
        }
        return start;// or else we can print the end also ;


    }
    public static int bs_a(int[] arr , int search , int end)
    {

        int start=0;



        while(start<=end){

            int mid = (start+end)/2;

            if (search>arr[mid]){
                start = mid + 1;
            }

            else if(arr[mid] > search){
                end = mid -1 ;
            }

            else{
                return mid ;
            }

        }
        return -1;
    }



    public static int bs_d(int[] arr , int search,int start)
    {


        int end=arr.length-1;


        while(start<=end){

            int mid = (start+end)/2;

            if (search<arr[mid]){
                start = mid + 1;
            }

            else if(arr[mid] < search){
                end = mid -1 ;
            }

            else{
                return mid ;
            }

        }
        return -1;
    }

}
