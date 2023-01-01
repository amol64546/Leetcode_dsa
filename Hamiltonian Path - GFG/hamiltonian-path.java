//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int M = Integer.parseInt(input_line[1]);
            
            input_line = read.readLine().trim().split("\\s+");
            ArrayList<ArrayList<Integer>> Edges = new ArrayList<ArrayList<Integer>>(); 
            for(int i = 0; i < M; i++){
                ArrayList<Integer> e = new ArrayList<Integer>();
                e.add(Integer.parseInt(input_line[2*i]));
                e.add(Integer.parseInt(input_line[2*i+1]));
                Edges.add(e);
            }
            Solution ob = new Solution();
            if(ob.check(N, M, Edges)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges) 
    { 
        // building graph
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
        for(int i=0; i<N+1; i++){
            graph.add(new ArrayList<Integer>());
        }
        for(ArrayList<Integer> list: Edges){
            graph.get(list.get(0)).add(list.get(1));
            graph.get(list.get(1)).add(list.get(0));
            
        }
       
        
        HashSet<Integer> visited = new HashSet<>();
        for(int i=1; i<N+1; i++){
            if(!visited.contains(i) && dfs(graph,N,i,visited)){
                return true;
                    
            }
            
        }
        
        return false;
        
    }
    
    
    boolean dfs(ArrayList<ArrayList<Integer>> graph,int N,int src, HashSet<Integer> visited){
      
        if(visited.size() == N-1) return true;
       
        visited.add(src);
        List<Integer> list = graph.get(src);
        for(int nbr: list){
            if(!visited.contains(nbr)){
                if(dfs(graph,N,nbr,visited)){
                    return true;
                }
            }
        }
        
        visited.remove(src);
        return false;
    }
    
} 