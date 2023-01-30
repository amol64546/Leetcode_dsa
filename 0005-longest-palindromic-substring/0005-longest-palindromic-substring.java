class Solution {
   
    public String longestPalindrome(String str) {
       int n = str.length();
		 boolean[][] dp = new boolean[n][n];
		 int max=0;
		 String ans = "";
		 for(int g=0; g<n; g++){
			 for(int i=0,j=g; j<n; j++,i++){
				 if(g==0) dp[i][j] = true;
				 else if(g==1) dp[i][j] = str.charAt(i)==str.charAt(j);
				 else{
					 dp[i][j] = str.charAt(i)==str.charAt(j) && dp[i+1][j-1];
					 
				 }
				 if(dp[i][j] && (j-i+1)>max){
					 ans = str.substring(i,j+1);
					 max = (j-i+1);
				 }
			 }
		 }
		 return ans;
    }
}