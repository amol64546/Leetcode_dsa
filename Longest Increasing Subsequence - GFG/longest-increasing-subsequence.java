//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} 
// } Driver Code Ends




class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int n, int a[])
    {
        // code here
        // int[][] dp = new int[n][n+1];
        // return memo(a,n,0,-1,dp);
        
        return tab(a,n);
    }
    
    static int tab(int[] a, int n){
        
        int[] currRow = new int[n+1];
        int[] nextRow = new int[n+1];
        
        for(int curr=n-1; curr>=0; curr--){
            for(int prev=curr-1; prev>=-1; prev--){
                int take=0;
                if(prev == -1 || a[curr] > a[prev]){
                    take = 1 + nextRow[curr+1];
                }
                int notTake = nextRow[prev+1];
                
                currRow[prev+1] = Math.max(notTake, take);
            }
            nextRow = currRow;
        }
        return nextRow[0];
    }
    
    static int memo(int[] a,int n,int curr,int prev,int[][] dp){
        if(curr == n){
            return 0;
        }
        
        if(dp[curr][prev+1] != 0) return dp[curr][prev+1];
        
        int take=0;
        if(prev == -1 || a[curr] > a[prev]){
            take = 1 + memo(a,n,curr+1,curr,dp);
        }
        int notTake = memo(a,n,curr+1,prev,dp);
        
        return dp[curr][prev+1] = Math.max(notTake, take);
    }
} 