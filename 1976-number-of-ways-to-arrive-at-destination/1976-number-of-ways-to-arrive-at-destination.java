 class Pair{
		int v,wt;
		public Pair(int v,int wt){
			this.v = v;
			this.wt = wt;
		}
	}

class Solution {
    public int countPaths(int n, int[][] roads) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<Pair>());
        }
		for(int[] e: roads){
			adj.get(e[0]).add(new Pair(e[1],e[2]));
			adj.get(e[1]).add(new Pair(e[0],e[2]));
		}

		PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.wt-b.wt);
        pq.add(new Pair(0,0));
        
		int[] times = new int[n];
        Arrays.fill(times,Integer.MAX_VALUE);
        times[0] = 0;
        
		int[] ways = new int[n];		
		ways[0] = 1;
		
		int mod = (int) (1e9+7);
        
		while(!pq.isEmpty()){
			int node = pq.peek().v;
			int time = pq.peek().wt;
			pq.remove();

			for(Pair p: adj.get(node)){
				int nextNode = p.v;
				int nextTime = p.wt;
				if(times[nextNode] > time+nextTime ){
					times[nextNode] = time+nextTime ;
					pq.add(new Pair(nextNode, time+nextTime));
					ways[nextNode] = ways[node];
				}
				else if(times[nextNode] == time+nextTime ){					
					ways[nextNode] = (ways[nextNode] + ways[node]) % mod;
				}
			}
			
		}
        
		return ways[n-1]%mod;
    }
}