package javaProblems;

public class zeros_in_int{
  public static void main(String[] args){
    
    int n = 12010303;
    //count number of zeros
    System.out.println(countz(n));
  }
  
  public static int countz(int n){
    
    
    if(n==0){
      return 0 ;
    }
    if(n%10 == 0 ){
      return (1+countz(n/10));
    }
    else{
      return countz(n/10);
    }
    
    
  }
  
}
