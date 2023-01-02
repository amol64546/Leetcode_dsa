class Solution {
    public int findLengthOfLCIS(int[] nums) {

        int len=1;
		int count=1;
        
       for(int j=1; j<nums.length; j++){
		   if(nums[j-1]<nums[j]){
			   len = Math.max(len,++count);			   
		   }else{
               count=1;
           }
	   }
        
        return len;
    }
}