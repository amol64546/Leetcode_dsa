class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        
        int n = arr.length;
        int[] prefix = new int[n+1];
        prefix[0]=0;
        for(int i=0; i<n; i++){
            prefix[i+1]=prefix[i]^arr[i];
        }
        
        int[] ans = new int[queries.length];
        for(int i=0; i<queries.length; i++){	
            int l = queries[i][1]+1;
            int r = queries[i][0];
            ans[i]= prefix[l] ^ prefix[r];    

	    } 
        return ans;
    }
}