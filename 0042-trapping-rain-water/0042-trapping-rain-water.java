class Solution {
    public int trap(int[] heights) {
        int n = heights.length;        
        if(n<3) return 0;        
       
        var st = new Stack<Integer>();
        int volume =0;
        
        for(int i=0; i<n; i++){
            while(!st.empty() && heights[i]>heights[st.peek()]){
                int index = st.pop();
                           
            if(!st.empty()){
              int height = Math.min(heights[i],heights[st.peek()]) -heights[index];
                int width  = i - st.peek() -1;
                volume += (height * width);
              }   
            }
            st.push(i);
        }
        
        return volume;
    }
}