class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        var st = new Stack<Integer>();
        int[] res = new int[n];
       
                
        for(int i=n-1; i>=0;  i--)
            st.push(nums[i]);
            
        for(int i=n-1; i>=0;  i--){    
                int curr = nums[i];
                 while(!st.empty() && curr>=st.peek()){
                          st.pop();                        
                 }
                if(st.empty())
                   res[i] = -1;                                                        
                else //if(curr<st.peek())
                        res[i] = st.peek();    
                
                st.push(curr); 
        }
                
        return res;
    }
}