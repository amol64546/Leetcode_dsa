class Solution {
    public int minCostClimbingStairs(int[] nums) {
         int n = nums.length;
        int oneStep = nums[0], twoStep=0;
        
        for(int i=1; i<n; i++){
            int curr = Math.min(oneStep,twoStep) + nums[i];
            twoStep = oneStep;  
            oneStep = curr;                     
        }
       
        return Math.min(oneStep,twoStep);
    }
    
   
}