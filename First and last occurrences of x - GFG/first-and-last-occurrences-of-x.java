//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class GFG
{
    
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> list = new  ArrayList<Long>();
        long first = firstOcc(arr,0,n-1,x); 
        long last = lastOcc(arr,0,n-1,x); 
        list.add(first);
        list.add(last);
        return list;
         
    }
    
    public long lastOcc(long[] arr,int l,int r,int x){
        if(arr[r]==x) return r;
        
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == x && arr[mid+1]> x){
                return mid;
               
            }else if(arr[mid] > x){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }
    
    public long firstOcc(long[] arr,int l,int r,int x){
        if(arr[0]==x) return 0;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == x && arr[mid-1]< x){
               return mid;
            }else if(arr[mid] < x){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return -1;
    }
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Long> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}

// } Driver Code Ends