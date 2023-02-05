//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    public long count(int coins[], int N, int sum) {
        long[][] dp = new long[N][sum+1];
        
        for(int i=N-1; i>=0; i--){
            for(int j=0; j<=sum; j++){
                if(j==0) dp[i][j] =  1;
                
                else {
                    long pick = (j-coins[i]<0) ? 0: dp[i][j-coins[i]];
                    long notpick = (i+1>N-1) ? 0:dp[i+1][j]; 
                    dp[i][j] = pick + notpick;
                }
            }
        }
        return dp[0][sum];
    }
    
}