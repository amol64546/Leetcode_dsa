class Solution {
    public int[][] kClosest(int[][] p, int k) {
       
        Arrays.sort(p,(a,b) -> dist(a)-dist(b) );
       
        int[][] ans = new int[k][2];
        for(int i=0; i<k; i++){                
            ans[i] = p[i];          
        }
        return ans;
    }
    
    public int dist(int[] p){
        return p[0]*p[0] + p[1]*p[1];
    }
}

