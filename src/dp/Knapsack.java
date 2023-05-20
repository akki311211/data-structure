package dp;

import java.util.Arrays;

public class Knapsack {
    public static void main(String[] args) {
        int profit[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50;
        int n = profit.length;
        System.out.println(maxrecursion(W, weight, profit, n));
        int[][] dp = new int[n+1][W+1];
        for(int i = 0; i < n+1; i++){
            for(int j= 0; j <W+1; j++){
                dp[i][j]  = -1;
            }
        }
        //Arrays.fill(dp, -1);
        System.out.println(memoization(W, weight, profit, n, dp));

    }
    private static int maxrecursion(int W, int[] wt, int[] val, int n){
        if(n == 0 || W == 0){
            return 0;
        }
        if(wt[n-1] > W){
            return maxrecursion(W, wt, val, n-1);
        }
        return Math.max(val[n-1]+maxrecursion(W-wt[n-1], wt, val, n-1), maxrecursion(W, wt, val, n-1));
    }
    private static int memoization(int W, int[] wt, int[] val, int n, int[][] dp){
        if(n == 0 || W == 0){
            return 0;
        }
        if(dp[n][W] != -1){
            return dp[n][W];
        }
        if(wt[n-1] > W){
            return dp[n][W] = memoization(W, wt, val, n-1, dp);
        }
        return dp[n][W] = Math.max(val[n-1]+memoization(W-wt[n-1], wt, val, n-1, dp), memoization(W, wt, val, n-1, dp));
    }
}
