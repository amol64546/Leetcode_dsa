//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;




class Array
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	    {
	    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    int key = sc.nextInt();
		    Solution ob=new Solution();
		    int ar[]=ob.findIndex(arr,n,key);
		    System.out.println(ar[0]+" "+ar[1]);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int a[], int N, int key) 
    { 
        //code here.
        int[] ans = new int[2];
        
        int first = firstOcc(a,0,N,key);
        int second = lastOcc(a,N-1,N,key);
        ans[0] = first;
        ans[1] = second;
        return ans;
    }
    
    static int firstOcc(int a[],int i, int N, int key){
        if(i==N) return -1;
        if(a[i]==key) return i;
        return firstOcc(a,i+1,N,key);
    }
    
    static int lastOcc(int a[],int i, int N, int key){
        if(i<0) return -1;
        if(a[i]==key) return i;
        return lastOcc(a,i-1,N,key);
    }
}