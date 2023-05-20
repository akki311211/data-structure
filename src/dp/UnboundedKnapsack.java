package dp;

public class UnboundedKnapsack {
    public static void main(String[] args) {
        int W = 100;
        int val[] = {10, 30, 20};
        int wt[] = {5, 10, 15};
        int n = val.length;
        System.out.println(max(W, wt,val,n));
    }
    private static int max(int W, int[] wt, int[] val, int n){
        int[] dp = new int[W+1];
        for(int i=0; i<=W; i++){
            for(int j=0; j<n; j++){
                if(wt[j]<=i)
                dp[i] = Math.max(dp[i], val[j]+dp[i-wt[j]]);
            }
        }
        return dp[W];
    }
}
