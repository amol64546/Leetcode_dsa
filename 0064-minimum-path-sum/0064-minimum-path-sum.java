class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n+1][m+1];
        
        for(int i=n-1; i>=0; i--){
            for(int j=m-1; j>=0; j--){
                if(i==n-1 && j==m-1){
                    dp[i][j] = grid[i][j];
                    continue;
                }
               int right = (j+1>=m) ? (int)1e9: dp[i][j+1];  // next column
               int down  = (i+1>=n) ? (int)1e9: dp[i+1][j];  // next row
               dp[i][j] = grid[i][j] + Math.min(right,down);  // max add to curr
            }
        }
        
        return dp[0][0];
    }
}