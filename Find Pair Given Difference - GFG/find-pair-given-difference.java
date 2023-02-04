//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int l = sc.nextInt();
            int n = sc.nextInt();
            
            int arr[] =  new int[l];
            
            for(int i = 0;i<l;i++)
                arr[i] = sc.nextInt();
            
            Solution ob = new Solution();
                
            if(ob.findPair(arr, l, n)==true)
                System.out.println(1);
                
            else
                System.out.println(-1);    
                
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        //code here.
        Arrays.sort(arr);
        
        for(int i=0; i<size; i++){
            int target = n+arr[i];
            if(binarySearch(arr,i+1,size-1,target)) return true;
        }
        return false;
    }
    
    public boolean binarySearch(int[] arr,int i,int j,int k){
        
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]==k) return true;
            else if(arr[mid]<k) i=mid+1;
            else j=mid-1;
        }
        return false;
        
    }
}