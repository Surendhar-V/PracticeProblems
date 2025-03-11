package javaProblems;/*

INTUITION - We take a mid variable and check whether the mid element is greater than or less than or equal to...
            If GREATER , end = mid-1;
            If LESSER , start =  mid + 1;
            If EQUAL , return  mid ;

 */


public class bs{
  public static void main(String[] args){
    
    int[] arr = { 2,4,6,8,10,12};
    
    //binary search
    
    int search =11;
    System.out.println(bn(arr,search));
    
   
  }
   public static int bn(int[] arr , int search)
    {
      
    int start=0; 
    int end=arr.length-1;
    
    
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
}
