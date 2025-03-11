package javaProblems;

public class ceiling{
  
  public static void main(String[] args){
    
    int[] arr = {2,4,6,8,10};
    int search=11;
    System.out.println(bs(arr,search));
  }
  
  //printing the ceiling of the number
  
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
  if(start>arr.length-1){
    System.out.println("Ceiling cant be print for this number....");
    return search;
  }
  else{
    return arr[start];
  }
  
}
}
