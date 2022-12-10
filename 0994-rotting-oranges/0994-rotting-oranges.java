class Solution {
    public int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        
        Queue<Integer[]> q = new LinkedList<>();
        int fresh=0, minute=0;
        
        // adding minute 0 rotten
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(grid[i][j]==2){
                    Integer[] x = {i,j};
                    q.offer(x);
                } else if (grid[i][j] == 1) {
                    fresh++; // count fresh oranges
                }

            }
        }
        if(fresh==0) return 0;
        
        Integer[][] direction = {{1,0},{-1,0},{0,1},{0,-1}};
        
        while(!q.isEmpty()){
            int size = q.size(); // no of previous minute rooten oranges
            for(int i=0; i<size; i++){
                Integer[] curr = q.poll();  
                
                // rot every orange adjecent to every rotten from prev
                // iterate for 4 directions
                for(Integer[] dir: direction){
                    Integer x = dir[0] + curr[0];
                    Integer y = dir[1] + curr[1];
                    
                     // out of bounds
                    if(x<0 || y<0 || x>=r || y>=c || grid[x][y]!=1)
                        continue;                   
                   
                    grid[x][y] = 2;  // rotting
                    Integer[] new_rotten = {x,y};
                    q.offer(new_rotten);
                    fresh--;
                }
            }
            minute++;
        }
        
        return (fresh==0) ? (--minute) : -1;
    }
}