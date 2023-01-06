class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        
        
        
        int[] res = new int[numCourses];
        int index=0;
        
        // dealing with dependencies
        int[] dep = new int[numCourses];
        
        for(int[] course: prerequisites){           
            dep[course[0]]++;
        }
        
       
        Queue<Integer> q = new LinkedList<Integer>();
        
        for(int i=0; i<numCourses; i++){
            if(dep[i]==0){
                res[index++] = i;
                  q.offer(i);
            }
        }
        
        while(!q.isEmpty()){
            int curr = q.poll();			
            
             for(int i=0; i<prerequisites.length; i++){  
                 int src = prerequisites[i][1];
			    int nbr = prerequisites[i][0];
                if(src==curr){   // checking for nbrs in edges graph
                     dep[nbr]--;                
                    if(dep[nbr]==0){
                        res[index++] = nbr;
                         q.offer(nbr);
                    }
                }
            }            
        }
		
        
        return (index==numCourses) ? res : new int[0];
    }
}