package javaProblems;/*

INTUITION - When the binary search return -1 , It means the while condition became terminated.
            At the stage of termination , the Start pointer will be pointing to the element greater than the target element [ ceiling]
            And the end pointer will be pointing to the element lesser than the target element. [ floor ]
 */




public class floor{
  
  public static void main(String[] args){
    
    int[] arr = {2,4,6,8,10};
    int search=5;
    System.out.println(bs(arr,search));
  }
  
  //printing the floor of the number
  
  public static int bs(int[] arr , int search){
  
  int start = 0;
  int end = arr.length-1;
  
  while(start <= end){
    int mid = (start+end)/2;
    
    if(arr[mid]>search){
      end = mid-1;
    }
    else if(arr[mid]<search){
      start = mid+1;
    }
    else{
      return mid;
    }
    
  }
  if(end<0){
    System.out.println("Floor can't be print for this number....");
    return search;
  }
  else{
    return arr[end];
  }
  
}
}
