package javaProblems;

public class
digits_integer{
  public static void main(String[] arg){
    
    int n = 25478928;
    System.out.println(digits(n));
    
  }
  
  public static int digits(int n){
    
    if(n==0){
      return 0;
    }
    
    return 1+digits(n/10);
  }
  
}
