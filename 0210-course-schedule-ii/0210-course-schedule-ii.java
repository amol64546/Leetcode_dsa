class Solution {
    public int[] findOrder(int n, int[][] arr) {
        int[] indeg = new int[n];
        int count=0;
        for(int[] e: arr){
            indeg[e[0]]++;           
        } 
        
        Queue<Integer> q = new LinkedList<>();
        int[] ans = new int[n];
        int k=0;
        for(int i=0;i<n;i++){            
         if(indeg[i]==0) {
            q.offer(i);
              ans[k++] = i;
         }
        }
        
        while(!q.isEmpty()){
            int temp = q.poll();            
            for(int[] e: arr){
                if(e[1]==temp){
                    indeg[e[0]]--;                    
                    if(indeg[e[0]]==0){
                         q.offer(e[0]);
                         ans[k++] = e[0];
                    }
                }
            }
        }
        return k==n ? ans: new int[0];
    }
}