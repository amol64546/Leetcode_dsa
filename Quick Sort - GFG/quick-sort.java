//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // base case
        if(low >= high) return;
        // getting partition index
        int pi = partition(arr,low,high);
        
        // sort elements before partition
        quickSort(arr,low,pi-1);
        // sort elements after partition
        quickSort(arr,pi+1,high);
    }
    
    // select last ele as pivot
    // places pivot at its correct pos acc sorted array
    // places all smaller in left and greater in right of pivot
    
    static int partition(int arr[], int l, int r)
    {
        int pivot = arr[r];
        int i = l;
        
        for(int j=l; j<=r; j++){
            // swapping smaller than pivot to left part
            if(arr[j] <= pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        // pivot index
        return i-1;
        
    } 
}
