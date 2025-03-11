package javaProblems;

/*

INTUITION - We right shift the bits one by one   until the number gets to zero
            And in each operation the count variable is incremented.

 */
public class bits_zero{
  public static void main(String[] args){
  
    //number of bits it needs to move to attain zero
    
    int num = 22; //10110
    int pos = 0;
    while(num > 0){
      num =num >> 1 ;
      pos ++;
    }
    System.out.println(pos);
  }
}