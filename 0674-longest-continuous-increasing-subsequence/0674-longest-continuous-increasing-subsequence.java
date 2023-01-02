class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int i=0, j=1;
        int n = nums.length;
        int len=0;
        while(j<n){
            if(nums[j-1]>=nums[j]){
                len = Math.max(len,j-i);
                i = j;
            }
            j++;
        }
        
        len = Math.max(len,j-i);
        
        return len;
    }
}