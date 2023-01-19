class Solution {
    public int lengthOfLIS(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
		for(int i=0; i<n; i++){
			int ans =0;
			for(int j=i-1; j>=0; j--){
				if(arr[j]>=arr[i]) continue;
				ans = Math.max(ans,dp[j]);
			}
			dp[i] = ans+1;
		}
		int max = 0;
        for(int val: dp) max=Math.max(max,val);
        return max;
    }
}