class Solution {
    class Pair{
        int v,wt;
        Pair(int v,int wt){
            this.v = v;
            this.wt = wt;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        PriorityQueue<Pair> min = new PriorityQueue<>((a,b)->a.wt-b.wt);
        HashSet<Integer> visited=new HashSet<>();
        int ans =0;
        min.add(new Pair(k,0));
       
        
        while(!min.isEmpty()){
            Pair p = min.remove();
            if(visited.contains(p.v)) continue;
            visited.add(p.v);
            ans = Math.max(ans,p.wt);
            for(int i=0; i<times.length; i++){
                if(times[i][0]==p.v){
                    int nbr = times[i][1];
                    int wt = times[i][2];
                    if(visited.contains(nbr)) continue;
                    min.add(new Pair(nbr,wt+p.wt));
                }
            }
        }
        return visited.size()==n ? ans : -1;
    }
}