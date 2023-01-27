class Solution {
    public int maxProfit(int k, int[] prices) {
         int n = prices.length;
        int[][] dp = new int[k+1][n];
        
        for(int t=1; t<=k; t++){
            int factor = -prices[0];
            for(int i=1; i<n; i++){
                int dontDoTrans = dp[t][i-1];
                int doTrans = prices[i] + factor;
                factor = Math.max(factor,-prices[i]+dp[t-1][i]);
                
                dp[t][i] = Math.max(dontDoTrans,doTrans);
            }
        }
        
        return dp[k][n-1];
    }
}