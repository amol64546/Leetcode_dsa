class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        // building graph
        List<List<Integer>> graph = new ArrayList<>();
        
        for(int i=0; i<numCourses; i++){
            graph.add(new ArrayList<Integer>());
        }
        
        // dealing with dependencies
        int[] dep = new int[numCourses];
        
        for(int[] course: prerequisites){
            graph.get(course[1]).add(course[0]);
            dep[course[0]]++;
        }
        
        // startin dfs
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<numCourses; i++){
            if(dep[i]==0){
                 st.push(i);
            }
        }
        
        while(!st.empty()){
            int curr = st.pop();
            List<Integer> list = graph.get(curr);
            for(int nbr: list){                
                dep[nbr]--;                
                if(dep[nbr]==0){
                    st.push(nbr);
                }
            }            
        }
        for(int i=0; i<numCourses; i++){
            if(dep[i]>0){
                 return false;
            }
        }
        return true;
       
    }
}