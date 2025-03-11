package javaProblems;

/*
INTUITION - We can take a pointer and check whether the current element and the next element is greather than.
            If yes, return true ;
            IF no , return false;
 */
public class arr_ab{
  public static void main(String[] arg){
    
    int[] arr = {1,2,3,4,5,7,8,9};
    System.out.println(isaccending(arr));
    
    
  }
    
    static int i = 0;
    
    public static boolean isaccending(int[] arr){
      
      if(arr[i]>arr[++i]){
        return false;
      }
      if(i==arr.length-1){
          return true ; 
      }
      else{
        return isaccending(arr);
      }
      
      
    }
    
    
}
