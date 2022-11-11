class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=1, j=0;
        while(++j<n){
            if(nums[j]!=nums[j-1]){
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}