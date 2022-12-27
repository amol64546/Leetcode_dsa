class Solution {
 
    public void sortColors(int[] nums) {
         int l=0, r=nums.length-1;
        int i=0;
        while(i<=r){                           
            if(nums[i]==0)             
                nums[i] = (nums[i]+nums[l]) - (nums[l++]=nums[i++]) ; 
            else if(nums[i]==2)
                nums[i] = (nums[i]+nums[r]) - (nums[r--]=nums[i]) ; 
            else i++;                 
        }
    }
}
    
 
