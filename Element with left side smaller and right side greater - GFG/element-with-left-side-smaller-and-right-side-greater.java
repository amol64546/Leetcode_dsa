//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            String[] inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.findElement(a, n));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Compute {
    public int findElement(int arr[], int n){
        
           int[] prefix = new int[n];  // max
           int[] suffix = new int[n];  // min
           int max = Integer.MIN_VALUE;
           int min = Integer.MAX_VALUE;
           for(int i=0; i<n; i++){                       
                    prefix[i]=Math.max(max,arr[i]);
                        max = prefix[i];
                    suffix[n-i-1]=Math.min(min,arr[n-i-1]);
                        min = suffix[n-1-i];
                        
            } 
                  
                // for(int i=1; i<n-1; i++){
                //       if(prefix[i-1]<arr[i] && suffix[i+1]>arr[i])
                //               return arr[i];
                //  }
                for(int i=0; i<n; i++){ 
                    if(i!=0 && i!=n-1 && prefix[i]==suffix[i]){
                            return arr[i];    
                    }	      
	            }
              
                 return -1;
    }
}