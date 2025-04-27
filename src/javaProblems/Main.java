package javaProblems;

class Main {

    public static void main(String[] args) {
        int[] arr = {2,7,9,3,1};
        int res = rob(arr);
        System.out.println(res);
    }

    public static int rob(int[] arr) {

        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0] , arr[1]);

        for (int i =2 ; i<arr.length ; i++){
            dp[i] = Math.max(dp[i - 2]+arr[i] , dp[i-1]);
        }

        return Math.max(dp[arr.length-1] , dp[arr.length-2]);

    }

}