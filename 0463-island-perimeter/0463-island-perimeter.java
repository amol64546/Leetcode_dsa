class Solution {
    
    int perimeter=0;
    public int islandPerimeter(int[][] grid) {
         int sr = grid.length, sc = grid[0].length;
       boolean[][] visited = new boolean[sr][sc];
        for(int i=0; i<sr; i++){
            for(int j=0; j<sc; j++){
                if(grid[i][j]==1){
                    DFS(grid,i,j,visited);
                    break;
                }
               
            }
        }
        return perimeter;
    }

      
     public void DFS(int[][] grid, int sr, int sc, boolean[][] visited){
       
         
        if(sr<0 || sr>=grid.length){
            perimeter++;
            return;
        }                     
        if(sc<0 || sc>=grid[0].length){
             perimeter++;
            return;
        }
         
        if(grid[sr][sc]==0){   //  water 
            perimeter++;
            return;
        }
        if(visited[sr][sc]) return;   // visited
         
         visited[sr][sc] = true;
               
         DFS(grid,sr+1,sc,visited);
         DFS(grid,sr-1,sc,visited);
         DFS(grid,sr,sc+1,visited);
         DFS(grid,sr,sc-1,visited);
            
    }
    
  
}