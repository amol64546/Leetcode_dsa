class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        
        Arrays.sort(nums);
        int closest = nums[0]+nums[1]+nums[2];
    
        
        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i+1, k=n-1;
            while(j<k){
                // sum of 3 elements
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==target) return sum;
                
                if(Math.abs(target-sum) < Math.abs(target-closest))  // measuring closeness
                    closest = sum;
                    
                if(sum>target) k--;
                else j++; 
       
            }
        }
        
        return closest;
    }
}