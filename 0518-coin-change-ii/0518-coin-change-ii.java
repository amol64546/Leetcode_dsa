class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<=amount; j++){
                if(j==0){
                    dp[i][j] = 1;
                    continue;
                }
                int pick = j-coins[i]<0 ? 0 : dp[i][j-coins[i]];
                int notpick = (i+1)>n-1 ? 0 : dp[i+1][j];
                dp[i][j] = pick+notpick;
            }
        }
        return dp[0][amount];
    }
   
}