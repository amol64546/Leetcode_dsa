class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum=0;
        for(int val: nums) sum+=val;
        if(sum%2==1) return false;
        int W = sum/2;
        
         boolean[][] dp = new boolean[n+1][W+1];
         
         for(int i=1; i<=n; i++){
             for(int j=0; j<=W; j++){
                 if(j==0) dp[i][j] = true;
                 
                 else if(j<nums[i-1]) {
                     dp[i][j] = dp[i-1][j];                      
                 }else{
                      dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]]; 
                 }
               
             }
         }
         return dp[n][W];
    }
}