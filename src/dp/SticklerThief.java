package dp;

import java.util.Arrays;

public class SticklerThief {
    public static void main(String[] args) {
        int n = 6;
        int a[] = {5,5,10,100,10,5};
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.print(max(n-1, a, dp));

    }
    private static int max(int n, int a[], int[] dp){
        if(n < 0){
            return 0;
        }
        if(n == 0){
            return a[0];
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int exc = max(n-1, a, dp);
        int inc = a[n] + max(n-2, a, dp);
        return dp[n] = Math.max(exc, inc);
    }
}
