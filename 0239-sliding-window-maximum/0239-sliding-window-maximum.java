class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = arr.length;

        int[] ans = new int[n-k+1];      
        
       
        for(int i=0; i<n; i++){
            // out of scope, remove first
            if(!dq.isEmpty() && dq.peek()<i-k+1)
                dq.removeFirst();
            
            // removing smaller than curr in window, remove last
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()])
                dq.removeLast();
            
            // add curr to window, add at last
            dq.addLast(i);
            
            // max of curr window, peek first element
            if(i-k+1 >= 0)
                ans[i-k+1] = arr[dq.peek()];
        }
        return ans;
        
    }
}