class Solution {
    public boolean canFinish(int n, int[][] arr) {
        // List<List<Integer>> adj = new ArrayList<>();        
        // for(int i=0;i<n;i++){
        //     adj.add(new ArrayList<>());
        // }
        // for(int[] e: arr){
        //     adj.get(e[1]).add(e[0]);          
        // }
        
        int[] indeg = new int[n];
        int count=0;
        for(int[] e: arr){
            indeg[e[0]]++;           
        } 
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0;i<n;i++){            
         if(indeg[i]==0) {
            q.offer(i);
              count++;
         }
        }
        
        while(!q.isEmpty()){
            int temp = q.poll();            
            for(int[] e: arr){
                if(e[1]==temp){
                    indeg[e[0]]--;                    
                    if(indeg[e[0]]==0){
                         q.offer(e[0]);
                         count++;
                    }
                }
            }
        }
        // for(int i: indeg) if(i!=0) return false;
        // return true;
        
        return count==n;
        
        
    }
}