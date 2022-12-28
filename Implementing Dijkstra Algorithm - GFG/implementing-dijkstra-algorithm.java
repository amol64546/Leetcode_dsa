//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main(String args[]) throws IOException {

        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            int S = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            
            int[] ptr = ob.dijkstra(V, adj, S);
            
            for(i=0; i<V; i++)
                System.out.print(ptr[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
 
	  int[] minDist = new int[V];
	  Arrays.fill(minDist, Integer.MAX_VALUE);
	  minDist[S] = 0;
	
	  boolean[] visited = new boolean[V];
	  PriorityQueue<ArrayList<Integer>> q = new PriorityQueue<>(
		  (ArrayList<Integer> a, ArrayList<Integer> b) -> 
			  a.get(1)-b.get(1)
	  );
	  
	  ArrayList<Integer> pair = new ArrayList<Integer>();
	  pair.add(S);
	  pair.add(0);
	  q.offer(pair);	  
	  
	  
	  while(!q.isEmpty()){
		  ArrayList<Integer> currList= q.poll();		  
		  int currV = currList.get(0);		  
		  
		  if(visited[currV]) continue;
		  
		  visited[currV] = true;		 
		  
		  for(ArrayList<Integer> list : adj.get(currV)){			  
				  int nbr = list.get(0);
				  int wt = list.get(1);
				 if(minDist[nbr] > minDist[currV] + wt)	{
					 minDist[nbr] = minDist[currV] + wt;
					ArrayList<Integer> p = new ArrayList<Integer>();
					  p.add(nbr);
					  p.add(minDist[nbr]);
					  q.offer(p);
				 }		  
		  }	
		   
	  }
	  return minDist;       
  }
}

