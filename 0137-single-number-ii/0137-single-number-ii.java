class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        
        
        for(int i=1; i<n-1; ){
            if(nums[i]==nums[i-1]){
                i += 3;
            }else{
                return nums[i-1];
            }
        }
        return 0;
    }
}