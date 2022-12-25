class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int l=0, r=nums.length-1;
        
        while(l<r){
            int mid = (l+r)/2;
            if(nums[mid]==nums[mid+1]){
                mid--;
            }
            if(((mid-l+1)&1)==0) l=mid+1;
            else r = mid;
        }
        return nums[l];
    }
}