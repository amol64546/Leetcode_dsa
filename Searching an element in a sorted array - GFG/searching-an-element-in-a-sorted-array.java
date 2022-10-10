//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class gfg
{
    
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String s[] = read.readLine().trim().split("\\s+");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            
            int arr[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            for(int i = 0; i < n; i++)
            {
                arr[i] = Integer.parseInt(st[i]);
            }
            
            Solution obj = new Solution();
            
            System.out.println(obj.searchInSorted(arr, n, k));
        }
    }
}
// } Driver Code Ends


class Solution{
    static int searchInSorted(int arr[], int n, int k)
    {
        
        // Your code here
        return binary(arr,0,n-1,k);
    }
    
    static int binary(int[] arr, int l,int r, int k){
         if(l>r) return -1;
        int mid=(l+r)/2;
       
        if(k<arr[mid]) return binary(arr,l,mid-1,k);
        
        if(k>arr[mid]) return binary(arr,mid+1,r,k); 
        
        return 1;
    }
}