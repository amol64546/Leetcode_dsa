class Solution {
    public int[] buildArray(int[] nums) {
        
        int n = nums.length;
        for(int i=0; i<nums.length; i++)
            nums[i] = n*(nums[nums[i]]%n)+nums[i];
        for(int i=0; i<nums.length; i++)
            nums[i] /= n;
        
        return nums;
    }
}