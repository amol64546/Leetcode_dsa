class Solution {
    public int removeElement(int[] nums, int val) {    
        int n = nums.length;
        int i=-1, j=0;
        while(++i<n){
            if(nums[i]!=val){
                nums[j++] = nums[i];                
            }
        }
        return j;
    }
}