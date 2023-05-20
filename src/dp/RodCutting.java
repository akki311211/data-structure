package dp;

public class RodCutting {
    public static void main(String[] args) {
        int N = 8;
        int[] price = {3, 5, 8, 9, 10, 17, 17, 20};
        int val[] = new int[N];
        for(int i=0;i<N; i++){
            val[i] = i+1;
        }
        System.out.println(max(N, val, price, N));
    }
    private static int max(int W, int[] wt, int[] val, int n){
        int[] dp = new int[W+1];
        for(int i=0; i<=W; i++){
            for(int j = 0; j < n; j++){
                if(wt[j] <= i)
                dp[i] = Math.max(val[j] + dp[i-wt[j]] , dp[i]);
            }
        }
        return dp[W];
    }

}
