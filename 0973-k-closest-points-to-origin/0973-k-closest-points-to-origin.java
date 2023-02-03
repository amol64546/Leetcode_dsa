class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.dist-a.dist);
        
        for(int i=0; i<n; i++){
             int x = points[i][0], y = points[i][1];
             int dist = x*x + y*y;
            pq.add(new Pair(dist,x,y));
            if(pq.size()>k) pq.remove();
        }
        
       
        int[][] ans = new int[k][2];
        for(int i=0; i<k; i++){
            Pair p = pq.remove();
            int x = p.x, y = p.y;
            ans[i][0] = x;
            ans[i][1] = y;
        }
        return ans;
    }
}

class Pair{
    int x,y,dist;
    Pair(int dist,int x,int y){
        this.dist=dist;
        this.x = x;
        this.y = y;
    }
}