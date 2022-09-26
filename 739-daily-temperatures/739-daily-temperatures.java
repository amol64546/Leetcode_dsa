class Solution {
    public int[] dailyTemperatures(int[] arr) {
        
        int n = arr.length;           
        Stack<Integer> st = new Stack<>();  
        //<index>         
        int ans[] = new int[n]; 
        
        for(int i=n-1; i>=0;i--){           
            while(!st.empty() && arr[st.peek()]<=arr[i])
                st.pop(); 
            
            if(st.empty())
                ans[i] = 0;      
            else  
                ans[i] = st.peek() - i; // distance 
            
            st.push(i);
        }
        
        return ans;
    }
}