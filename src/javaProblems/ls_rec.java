package javaProblems;

import java.util.*;
public class ls_rec{
  public static void main(String[] args){
     
    //linear search with recursion
   
   
    int[] arr = { 1,2,6,3,4,5,6,7};
    int search = 6;
    linearsearch(arr,search);
    
  }
  /*
  static int i = 0;
  public static void  linearsearch(int[] arr,int search){
    
    if(arr[i] != search){
      i++;
    linearsearch(arr,search) ;
    
  }
    else{
      System.out.println(i);
    }
    
    */

    
    //Aternative method;
  
    static ArrayList<Integer> list = new ArrayList<Integer>();
    static int i = 0;
  
  public static void  linearsearch(int[] arr,int search){
  
  if(i==arr.length){
    System.out.println(list);
  }
  
  else if(arr[i] != search){
      i++;
    linearsearch(arr,search) ;
  }
  
    else{
      list.add(i);
      i++;
      linearsearch(arr,search) ;
      
    }
    
    
    
  }

}
