class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        
        int leftMax = Integer.MIN_VALUE;
        int count=0;
        for(int i=0; i<n; i++){
            leftMax = Math.max(leftMax,arr[i]);
            if(leftMax==i)
                count++;
        }
        return count;
    }
}