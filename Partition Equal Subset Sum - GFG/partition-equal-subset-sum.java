//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum = 0;
        for(int val: arr){
            sum += val;
        }
        
        if(sum%2==1) {
            return 0;
        }
        int target = sum/2;
        int[][] dp = new int[N][target+1];
        for(int[] a: dp) {
            Arrays.fill(a,-1);
        }
        return solve(arr,0,N,target,dp);
    }
    
    
    static int solve(int[] arr,int i, int n,int target,int[][] dp){
        if(target==0) return 1;
        if(i==n || target<0) return 0;
        
        if(dp[i][target] != -1) return dp[i][target];
        
        int pick = solve(arr,i+1,n,target-arr[i],dp);
        int notpick = solve(arr,i+1,n,target,dp);
        
        return dp[i][target] = pick | notpick;
        
    }
}