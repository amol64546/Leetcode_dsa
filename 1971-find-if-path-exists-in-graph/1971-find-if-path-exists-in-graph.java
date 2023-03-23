class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
           // make a adj list        
        List<List<Integer>> adj = new ArrayList<>();        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e: edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        boolean[] vis = new boolean[n];
        if(dfs(adj,source,destination,vis)) return true;
        return false;
    }
    
    public boolean dfs( List<List<Integer>> adj,int s,int d, boolean[] vis){
        if(vis[s]) return false;
        vis[s]= true;
        
        if(s==d) return true;
        
        for(int nbr: adj.get(s)){
            if(dfs(adj,nbr,d,vis)) return true;
            
        }
        return false;
    }
    
    
    
}