class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=1; i<=n; i++){
            ans[i] = helper(i);
        }
        return ans;
    }
    
    int helper(int n){
        // if(n==0) return 0;
        if(n==1) return 1;
        
        if((n&1)==0) return helper(n/2);
        return 1+helper(n/2);
                 
        
    }
}