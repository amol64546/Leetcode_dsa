class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        return Math.max(robHelper(nums,0,n-2),robHelper(nums,1,n-1));
    }
    
    public int robHelper(int[] nums,int s,int e) {
        int rob1 = 0, rob2=0;
        
        for(int i=s; i<=e; i++){
            int temp = Math.max(rob2,rob1 + nums[i]) ;
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
}