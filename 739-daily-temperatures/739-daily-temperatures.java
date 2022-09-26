class Solution {
    public int[] dailyTemperatures(int[] arr) {
        
        int n = arr.length;
        Stack<Pair<Integer,Integer>> st = new Stack<>();
        
        // Pair<key,value> 
        // Pair<ele,index>
        
        int ans[] = new int[n];
        
        for(int i=n-1; i>=0;i--){
           
            while(!st.empty() && st.peek().getKey()<=arr[i])
                st.pop();
          
            if(st.empty())
                ans[i] = 0;
      
            else  
                ans[i] = st.peek().getValue() - i; // distance
          
            st.push(new Pair<Integer,Integer>(arr[i],i));
        }
        return ans;
    }
}