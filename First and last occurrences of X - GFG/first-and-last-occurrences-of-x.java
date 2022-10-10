//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            String inputLine[] = br.readLine().trim().split(" "); 
            int n = Integer.parseInt(inputLine[0]); 
            int x = Integer.parseInt(inputLine[1]);
            
            int arr[] = new int[(int)(n)];
            
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine1[i]);
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.firstAndLast(arr, n, x); 
            
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    } 
} 
            



// } Driver Code Ends


//User function Template for Java
class Solution{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int k){
        // Code here
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(first(arr,n,k));
        if(list.get(0)==-1) return list;
        list.add(last(arr,n,k));
        return list;
    }
    int last(int arr[], int n, int k){
         int l=0, r=arr.length-1;  
         int ans=-1;
        while(l<=r){
            int mid  = l+(r-l)/2;
            if(k<arr[mid]){
                r = mid - 1;
            }else if(k>arr[mid]){
                l = mid + 1;
            }else{
                ans=mid;
                l = mid + 1;
                
            }
        }
        return ans;
    }
    
    int first(int arr[], int n, int k){
         int l=0, r=arr.length-1;  
         int ans=-1;
        while(l<=r){
            int mid  = l+(r-l)/2;
            if(k<arr[mid]){
                r = mid - 1;
            }else if(k>arr[mid]){
                l = mid + 1;
            }else{
                ans=mid;
                r = mid - 1;
                
            }
        }
        return ans;
    }
}
