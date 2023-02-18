class Solution {
    
   
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length, m = grid[0].length;
         int maxArea =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==1){
                    maxArea=Math.max(dfs(grid,i,j),maxArea);
                }
            }
        }
        return maxArea;
    }
    
    public int dfs(int[][] grid, int r,int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0){
            return 0;
        }        
     
        grid[r][c] = 0; 

        return 1+ dfs(grid,r+1,c)+
                    dfs(grid,r-1,c)+
                    dfs(grid,r,c+1)+
                    dfs(grid,r,c-1);        
     
        
    }
}