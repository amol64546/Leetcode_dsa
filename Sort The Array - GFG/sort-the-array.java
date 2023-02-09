//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 


class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt(); 
            int arr[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                arr[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int []ans= obj.sortArr(arr, n);
            for(int i=0;i<n;i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int[] sortArr(int[] arr, int n) 
    { 
        mergeSort(arr,0,n-1);
        return arr;
    }
    
    void mergeSort(int[] arr,int l,int r){
        if(l>=r) return;
        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    
    void merge(int[] arr,int l,int mid,int r){
        int[] temp = new int[r-l+1];
        int k = 0;
        int i=l, j=mid+1;
        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid ){
            
                temp[k++] = arr[i++];
            
        }
        while(j<=r){
         
                temp[k++] = arr[j++];
            
        }
        k = 0;
        for(int p=l; p<=r; p++){
            arr[p] = temp[k++];
        }
    }
} 