class Solution {
   
    public int uniquePathsWithObstacles(int[][] a) {
        int m = a.length, n = a[0].length;
        int[][] dp = new int[m+1][n+1];
        
        
        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                if(a[i][j]==1) continue; // obstacle
                if(i==m-1 && j==n-1) dp[i][j] = 1;  //destination
                else dp[i][j] = dp[i+1][j]+dp[i][j+1];
            }
        }
        //for(int[] arr:dp) System.out.println(Arrays.toString(arr));
        return dp[0][0];
    }
    
   
}