class Solution {
    public int minCostClimbingStairs(int[] nums) {
         int n = nums.length;
        int prevInc = 0, prevExc=nums[0];
        
        for(int i=1; i<n; i++){
            int exc = Math.min(prevInc,prevExc) + nums[i];
            prevInc = prevExc ;  
            prevExc = exc;          
            //System.out.println(prevExc+" "+prevInc);
        }
       
        return Math.min(prevExc,prevInc);
    }
    
   
}