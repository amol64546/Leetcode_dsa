class Solution {
    public int rob(int[] nums) {
         int n = nums.length;
        int[] dp = new int[n+2];
        for(int i=n-1; i>=0; i--){
            int oneStep = dp[i+1];
            int twoStep = dp[i+2] + nums[i];
            dp[i] = Math.max(oneStep,twoStep) ;
        }
        return Math.max(dp[0],dp[1]);
    }
}