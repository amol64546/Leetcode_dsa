class Solution {
    public boolean find132pattern(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int sec = Integer.MIN_VALUE;

        for(int i=n-1; i>=0; i--){
            if(arr[i]<sec){
               
               return true; 
            }
                
            while(!st.empty() && arr[i]>st.peek())
                   sec = st.pop();                
            st.push(arr[i]);            
        }   
        
 
        return false;
    }
}