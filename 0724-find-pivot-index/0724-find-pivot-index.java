class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
       
        
        
        int sum=0;
        for(int i=n-1; i>=0; i--){
            sum += nums[i];
        }
        
        int prefix = 0, suffix=0;
        
        for(int i=0; i<n; i++){
            suffix = (sum-prefix-nums[i]);
          
            if(prefix == suffix){
                return i;
            }
            prefix += nums[i];
        }
        return -1;
    }
}