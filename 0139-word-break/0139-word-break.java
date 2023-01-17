class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        int[] dp = new int[s.length()];
       // return recur(s,0,set,dp);
       return tabulation(s,set);
    }
    
     boolean recur(String s,int pos,Set<String> set,int[] dp ){
		int len = s.length();
        if (pos >= len) {
            return true;
        }
        if(dp[pos] != 0) return dp[pos]==1? true:false;
        for(int i=pos; i<len; i++){
            if(set.contains(s.substring(pos,i+1)) && recur(s,i+1,set,dp)){
                    dp[pos] = 1;
                    return true;
            }                
        }
        dp[pos] = -1;
       return false;
	}
    
    boolean tabulation(String s,Set<String> set){
        int n = s.length();
         boolean[] dp = new boolean[n+1];
            dp[0] = true;
         for(int i=1; i<=n; i++){
             for(int j=i-1; j>=0; j--){
                if(dp[j] && set.contains(s.substring(j,i)) )
                   dp[i] = true; 
             }
         }
         return dp[n];
    }
}