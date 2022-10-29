class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        
        int n = arr.length;
        int[] prefix = new int[n+1];
        prefix[0]=arr[0];
        for(int i=1; i<n; i++){
            prefix[i]=prefix[i-1]^arr[i];
        }
        
        int[] ans = new int[queries.length];
        for(int i=0; i<queries.length; i++){	
            int[] q = queries[i];
            
            if(q[0]>0)
                ans[i]=prefix[q[1]] ^ prefix[q[0]-1];
            else
                ans[i] = prefix[q[1]];
	    } 
        return ans;
    }
}