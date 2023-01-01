class Solution {
    List<List<Integer>> allPaths = new ArrayList<>();
  
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
                
        List<Integer> path = new ArrayList<>();
        boolean[] vis = new boolean[n];
        
        path.add(0);
        printPath(graph,0,n-1,vis,path);
        
        return allPaths;
    }
    
    void printPath(int[][] graph,int src, int dest, boolean[] vis,List<Integer> path){
       
        if(src == dest){
            allPaths.add(new ArrayList<>(path));            
            return;
        }
        
         vis[src] = true;
        int[] nbr = graph[src];
        for(int i=0; i<nbr.length; i++){
            if(!vis[nbr[i]]){
                path.add(nbr[i]);
                printPath(graph,nbr[i],dest,vis,path);
                path.remove(path.size()-1);
            }
        }                    
        vis[src] = false;
    }
}