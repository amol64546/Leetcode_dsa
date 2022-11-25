class Solution {
    public int findDuplicate(int[] nums) {
         int slow=nums[0], fast=nums[0];
       do {
            slow=nums[slow];
            fast=nums[nums[fast]];  
            if(slow==fast)
                break;          
          
        } while(true);

         fast = nums[0]; 
        while(true){
            if(slow==fast)
                break;
            slow=nums[slow];
            fast=nums[fast];  
                      
        }

        return slow;
    }
}