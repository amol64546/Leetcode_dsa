class Solution {
    public int longestCommonSubsequence(String s, String t) {
        int[][] dp = new int[s.length()][t.length()];
        return memo(s,t,0,0,dp);
    }
    
    public int memo(String s,String t,int i,int j,int[][] dp){
        if(i==s.length() || j==t.length()) return 0;
        if(dp[i][j]!=0) return dp[i][j];
        if(s.charAt(i)==t.charAt(j)) return dp[i][j]=1+memo(s,t,i+1,j+1,dp);
        return dp[i][j]= Math.max(memo(s,t,i+1,j,dp),memo(s,t,i,j+1,dp));
    }
}