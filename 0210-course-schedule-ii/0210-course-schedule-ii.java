class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        List<Integer> ans = new ArrayList<Integer>();
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
			ans.add(curr);
            List<Integer> list = graph.get(curr);
            for(int nbr: list){                
                dep[nbr]--;                
                if(dep[nbr]==0){
                    st.push(nbr);
                }
            }            
        }
		int[] res = new int[numCourses];
        for(int i=0; i<numCourses; i++){
			
            if(dep[i]>0){
                 return new int[]{};
            }
        }
		for(int i=0; i<ans.size(); i++)
			res[i] = ans.get(i);
        return res;
    }
}