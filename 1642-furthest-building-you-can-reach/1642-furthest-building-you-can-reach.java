class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        
        int n = heights.length;
        
        for(int i=1; i<n; i++){
            int diff = heights[i] - heights[i-1];
            if(diff<=0) continue;
            min.offer(diff);    // using ladders
            if(min.size()>ladders) bricks -= min.poll();     // using bricks
            if(bricks<0) return i-1;    // can not go futher
        }
        return n-1;  // reached at last
    }
}