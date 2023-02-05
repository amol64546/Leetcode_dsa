class Solution {
   
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){               
                if(i==1 && j==1) dp[i][j] = 1;     //destination    
                else dp[i][j] = dp[i-1][j] + dp[i][j-1]; 
            }
        }
        for(int[] a:dp) System.out.println(Arrays.toString(a));
        return dp[m][n];
    }
}