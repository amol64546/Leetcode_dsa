//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
			Solution ob = new Solution();
			System.out.println(ob.findMaxDiff(a,n));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    int findMaxDiff(int a[], int n)
    {
	// Your code here	
	        int[] leftSmall = new int[n];
	        int[] rightSmall = new int[n];
	        
	        Stack<Integer> st = new Stack<>();
	        
	        for(int i=0; i<n; i++){
	            // find min value on left
	            while(!st.empty() && a[i]<=st.peek()){
	                st.pop();
	            }
	            if(!st.empty() && a[i]>st.peek()) {
	                leftSmall[i] = st.peek();
	            }
	            st.push(a[i]);
	             
	        }
	        st.clear();
	        
	        for(int i=n-1; i>=0; i--){
	            // find min value on right
	            while(!st.empty() && a[i]<=st.peek()){
	                st.pop();
	            }
	            if(!st.empty() && a[i]>st.peek()) {
	                rightSmall[i] = st.peek();
	            }
	            st.push(a[i]);
	        }
	        
	        // max abs diff bet leftSmall and rightSmall
	        int ans = Integer.MIN_VALUE;
	        for(int i=0; i<n; i++){
	            ans = Math.max(ans,Math.abs(leftSmall[i]-rightSmall[i]));
	        }
	        return ans;
    }
}