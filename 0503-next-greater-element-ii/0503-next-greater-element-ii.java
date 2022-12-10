class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        var st = new Stack<Integer>();
        int[] res = new int[n];
        Arrays.fill(res,-1);
        for(int i=0; i< 2*n; i++){
            int curr = nums[i%n];
            while(!st.empty() && curr>nums[st.peek()])
                res[st.pop()] = curr;
            if(i<n)
                st.push(i);
        }
        return res;
    }
}