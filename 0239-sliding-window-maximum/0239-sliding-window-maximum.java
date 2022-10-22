class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        Deque<Integer> d = new ArrayDeque<>();
        int n = arr.length;

        int[] ans = new int[n-k+1];
        int i, j=0;
        for(i=0; i<k; ++i){
            while(!d.isEmpty() && arr[i]>=arr[d.peekLast()])
                d.removeLast();
            d.addLast(i);
        }
        ans[j++] = arr[d.peek()];
        for( ; i<n; ++i){
            while(!d.isEmpty() && d.peek()<=i-k)
                d.removeFirst();
            while(!d.isEmpty() && arr[i]>=arr[d.peekLast()])
                d.removeLast();
            d.addLast(i);
            ans[j++] = arr[d.peek()];
        }
        return ans;
        
    }
}