class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        int[] dist = new int[n];
        
        for(int i=0; i<n; i++){
            int x = points[i][0];
            int y = points[i][1];
            dist[i] = x*x + y*y;            
        }
        
        Arrays.sort(dist);
        int distk = dist[k-1];
        int[][] ans = new int[k][2];
        int p = 0;
        for(int i=0; i<n; i++){
             int x = points[i][0];
            int y = points[i][1];
            int distance = x*x + y*y;  
            if(distance <= distk){
                ans[p][0] = x;
                ans[p++][1] = y;
            }
        }
        return ans;
    }
}