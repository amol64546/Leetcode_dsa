class Solution {
    public boolean find132pattern(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] leftMin = new int[n];
        leftMin[0] = arr[0];

        for(int i=1; i<n; i++)
            leftMin[i] = Math.min(leftMin[i-1], arr[i]);

        for(int i=n-1; i>=0; i--){
            if(arr[i]>leftMin[i]){
                while(!st.empty() && st.peek()<=leftMin[i])
                    st.pop();
                if(!st.empty() && st.peek()<arr[i])
                    return true;
                st.push(arr[i]);
            }
        }          
 
        return false;
    }
}