class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
       
        
        
        // dealing with dependencies
        int[] dep = new int[numCourses];
        
        for(int[] course: prerequisites){           
            dep[course[0]]++;
        }
        
        // startin dfs
        Stack<Integer> st = new Stack<>();
        int index=0;
        for(int i=0; i<numCourses; i++){
            if(dep[i]==0){
                 st.push(i);
                index++;
            }
        }
        
        while(!st.empty()){
            int curr = st.pop();
            
            for(int i=0; i<prerequisites.length; i++){    
                int src = prerequisites[i][1];
                int nbr = prerequisites[i][0];
                
                if(src==curr){
                     dep[nbr]--;                
                    if(dep[nbr]==0){
                        st.push(nbr);
                        index++;
                    }
                }
            }            
        }
        
        return (index==numCourses) ? true:false;
       
    }
}