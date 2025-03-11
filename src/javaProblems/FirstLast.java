package javaProblems;/*

INTUITION - If the array is sorted , we can make use of binary search.
            If we found a search , it may be possible that another occurence of the element may be there for left side or right side of the array element.
            So , after the search , we make the search again in both the side , after saving the current pos.


 */


public class FirstLast {

    public static void main(String[] args) {

        int[] arr = {5,6,7,8,8,10};
        int pos = 1;
        int search = 8;
        int pos1=firstlast(arr,search,pos);
        int pos2=firstlast(arr,search,0);
        System.out.println(pos1 + "  " + pos2);

    }

    private static int firstlast(int[] arr, int search, int pos) {
        int start = 0;
        int end = arr.length-1;
        int ans =0;
        while(start <= end )
        {
            int mid = (start+end)/2;

            if(arr[mid]>search){
                end=mid-1;
            }
            else if(arr[mid]<search){
                start = mid+1;
            }
            else{
                if(pos==1){
                   ans = mid;
                    end = mid-1;
                }
                else{
                    ans= mid;
                    start = mid+1;
                }

            }

        }
        return ans;

    }
}
