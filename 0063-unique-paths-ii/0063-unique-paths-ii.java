class Solution {
   
    public int uniquePathsWithObstacles(int[][] a) {
        int[][] dp = new int[a.length][a[0].length];
        return explore(a,0,0,dp);
    }
    
    public int explore(int[][] a,int i,int j,int[][] dp){
        if(i==a.length || j==a[0].length || a[i][j]==1) return 0;
        if(i+1==a.length && j+1==a[0].length) return 1;
        if(dp[i][j]!=0) return dp[i][j];
        return dp[i][j] = explore(a,i+1,j,dp)+explore(a,i,j+1,dp);
    }
}