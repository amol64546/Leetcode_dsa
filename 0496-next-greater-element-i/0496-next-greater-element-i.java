class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int n = nums1.length, m = nums2.length;
        
        for(int i=m-1; i>=0; i--){
            while(!st.empty() && nums2[i]>=st.peek()){
                st.pop();
            }
            if(st.empty())
                map.put(nums2[i],-1);
            else
                map.put(nums2[i],st.peek());
            st.push(nums2[i]);                
            
        }
        for(int i=0; i<n; i++){
            int temp = map.get(nums1[i]);
            nums1[i] = temp;
        }
        return nums1;
    }
}