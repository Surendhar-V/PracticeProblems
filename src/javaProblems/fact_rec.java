package javaProblems;

/*
INTUITION - The intuition is we can add the number and the recursion of the same number-1

 */
public class fact_rec{
  public static void main(String[] args){
    
    int n =5;
    System.out.println(fact(n));
    
  }
  
  
  public static int fact(int n){
    
    if(n<2){
      return n;
    }
  
    return n+fact(n-1);
  }
  
  
}
