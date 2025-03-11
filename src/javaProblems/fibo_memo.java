package javaProblems;

public class fibo_memo{

    // time complexity - O(n)
    // Space complexity - O(n)
    private static int[] fibo_cache;

    public static void main(String[] args){

        int n = 20;
        fibo_cache =  new int[n+1];

        System.out.println(fibo(n));


    }


    public static int fibo(int n){

        if(n<=2){
            return 1;
        }
        if(fibo_cache[n] != 0){
            return fibo_cache[n];
        }

        fibo_cache[n] =  fibo(n-1) + fibo(n-2);
        return fibo_cache[n];
    }


}



