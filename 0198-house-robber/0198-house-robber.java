class Solution {
    public int rob(int[] nums) {
         int n = nums.length;
        int prevInc = nums[0], prevExc=0;
        
        for(int i=1; i<n; i++){
            int exc = Math.max(prevInc,prevExc);  // have choice to inc or exc, take max
            int inc = nums[i] + prevExc ;   // dont have choice, need to exc
            prevExc = exc;
            prevInc = inc;
           
        }
        return Math.max(prevExc,prevInc);
    }
}