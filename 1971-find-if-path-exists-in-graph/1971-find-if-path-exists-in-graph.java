class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        List<List<Integer>> graph = new ArrayList<>();  
        for (int i = 0; i < n; i++){
            graph.add(new ArrayList<Integer>());
        }      
	
        for (int i = 0; i < edges.length; i++){
            int u = edges[i][0];   
            int v = edges[i][1];           
            graph.get(u).add(v);   
            graph.get(v).add(u);                    
        }
        

        boolean[] visited = new boolean[n];        
        Queue<Integer> pq = new LinkedList<>();
		pq.offer(source);
	 
	  while(!pq.isEmpty()){
		  int curr = pq.poll();	  		  
		  if(curr==destination) return true; 
          if(visited[curr]) continue;	
          visited[curr] = true; 	     

		  List<Integer> adj = graph.get(curr);      
		  for(int nbr: adj){
			  if(!visited[nbr]){                                    
				  pq.offer(nbr);
			  }
		  }	  
	  }
	  return false;
	}
}