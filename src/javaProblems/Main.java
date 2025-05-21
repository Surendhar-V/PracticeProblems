package javaProblems;

class Main {

    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        Main main = new Main();
//        System.out.println(main.colorTheGrid(m, n));
        int a = 1024;
        System.out.println(Integer.toBinaryString(a));
        int res = setCurLastValue(a , 5 , 0 , 3);
        System.out.println(Integer.toBinaryString(res));
        System.out.println(Integer.toBinaryString(main.removeCurLastValue(res , 5 , 0 )));
    }

    public int colorTheGrid(int m, int n) {

//        00 - NULL
//        01 - R
//        10 - G
//        11 - B

        int mod = (int) 1e9+7;
        int[][] memo = new int[1025][1024];
        int prev = 0;
        int cur = 0 ;
        return helper(0, 0,prev , cur, m  , n,mod);

    }

    private int helper(int row, int col, int prev, int cur, int m , int n ,int mod) {

        if(row >= m){
            return helper(0 , col+1 , cur , 0 , m , n ,  mod);
        }

        if(col == n){
            return 1;
        }

        int ans =0;

        for(int color =1 ; color<=3 ; color++){
            boolean canFit = true;
            if(col-1 >= 0 && getPrevLeftValue(prev , m , col) == color){
                canFit = false;
            }
            if(row-1 >= 0 && getCurTopValue(cur ,m , col ) == color){
                canFit = false;
            }
            if(canFit){
                cur = setCurLastValue(cur , m , col , color);
                ans = (ans+ helper( row+1 , col , prev , cur ,m , n , mod))%mod;
//                cur = removeCurLastValue(cur , m , col , color);
            }
        }

        return ans;

    }

    private static int setCurLastValue(int cur, int length, int row, int color){
        int leftShift = (length - row - 1 )*2;
        int mask = color<<leftShift;
        cur = cur | mask;
        return cur;
    }

    private int removeCurLastValue(int cur, int length, int row){
        int leftShift = (length - row - 1 )*2;
        int mask = 2<<leftShift;
        mask = ~mask;
        cur = cur & mask;
        return cur;
    }

    private int getCurTopValue(int cur, int length, int col){
        int leftShift = (length - col - 1 )*2;
        int mask = 3<<leftShift;
        cur = cur & mask;

        return cur;
    }

    private int getPrevLeftValue(int cur, int length, int col){
        int leftShift = (length - col)*2;
        int mask = 3<<leftShift;
        cur = cur & mask;
        return cur;
    }



}