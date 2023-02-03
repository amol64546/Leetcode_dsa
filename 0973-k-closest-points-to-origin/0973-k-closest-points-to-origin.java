class Solution {
    public int[][] kClosest(int[][] p, int k) {
        int n = p.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> dist(p[b])-dist(p[a]) );
        
        for(int i=0; i<n; i++){            
            pq.add(i);
            if(pq.size()>k) pq.remove();
        }
        
       
        int[][] ans = new int[k][2];
        for(int i=0; i<k; i++){     
            int idx = pq.remove();
            ans[i] = p[idx];          
        }
        return ans;
    }
    
    public int dist(int[] p){
        return p[0]*p[0] + p[1]*p[1];
    }
}

