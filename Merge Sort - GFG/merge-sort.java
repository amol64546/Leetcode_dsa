//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         
         
         int[] temp  = new int[r-l+1];
         
         int i=l, j=m+1, k=0;
         
         // copy to temp array acc to sorting order
         while(i<=m && j<=r){
             if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
             }else{
                 temp[k++] = arr[j++];
             }
         }
         
         // copy remaining data
         while(i<=m ){
            temp[k++] = arr[i++];
         }
         while(j<=r){
            temp[k++] = arr[j++];
         }
         
         // copy back to original array
         for(int p=l,t=0; p<=r; p++,t++){
            arr[p]  = temp[t];
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
        // base case
        if(l>=r) return;
        
        // find middle point
        int mid = (l+r)/2;
        
        // sort first and second halves
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        
        // merge the sorted halves
        merge(arr,l,mid,r);
    }
}
