class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
       Deque<Integer> d = new ArrayDeque<>();
        int[] ans = new int[n-k+1];
        int left = 0, right=0;
        
        for(; right<k; right++){  // window
                // max at front
               while(!d.isEmpty() && nums[right]>nums[d.peekLast()])
                   d.removeLast();
               d.addLast(right);
        }
                   
        ans[left++] = nums[d.peekFirst()];
                   
        for(; right<n; right++){ // slide window
               // remove out of scope from left
               if(!d.isEmpty() && d.peekFirst()<=left-1)
                   d.removeFirst();
             // removing max from right
               while(!d.isEmpty() && nums[right]>=nums[d.peekLast()])
                   d.removeLast();
               d.addLast(right);
                   
              ans[left++] = nums[d.peekFirst()];
        }
        return ans;
               
               
               
        
    }
}