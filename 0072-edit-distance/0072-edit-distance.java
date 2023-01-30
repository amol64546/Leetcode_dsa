class Solution {
    public int minDistance(String s, String t) {
        int n = s.length(), m = t.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=n; i>=0; i--){
            for(int j=m; j>=0; j--){
                if(i==n && j==m) continue;
                else if(i==n)  dp[i][j] = m-j;
                else if(j==m)  dp[i][j] = n-i;
                else if(s.charAt(i)==t.charAt(j)) dp[i][j] = dp[i+1][j+1];
                else{
                    int insert = dp[i][j+1];
                    int delete = dp[i+1][j];
                    int replace = dp[i+1][j+1];
                    dp[i][j] = 1+Math.min(insert,Math.min(delete,replace));
                }
            }
        }
        return dp[0][0];
    }
}