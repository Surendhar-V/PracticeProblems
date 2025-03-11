package javaProblems;

public class bs_rec{
  public static void main(String[] args){
    
    int[] arr = {1,2,3,4,5,6,7};
    int search = 7;
    int start = 0 ;
    int end = arr.length - 1 ;
    
    System.out.println(bn(arr,search , start , end ));
      }
      
      public static int bn(int[] arr , int search , int start , int end){
      
        int m = (start + end ) / 2;
        
        if(arr[m]> search){
          return bn(arr,search , start , m-1 );
        }
        if(start>end){
          return -1;
        }
        else if(arr[m]< search){
          return bn(arr,search , m+1 , end );
        }
        else 
          return m ;
         
      }
        
      
}
