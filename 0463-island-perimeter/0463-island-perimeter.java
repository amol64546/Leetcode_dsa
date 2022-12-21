class Solution {
    
    int perimeter=0;
    public int islandPerimeter(int[][] grid) {
         int sr = grid.length, sc = grid[0].length;
      
        for(int i=0; i<sr; i++){
            for(int j=0; j<sc; j++){
                if(grid[i][j]==1){
                    DFS(grid,i,j);
                    break;
                }
               
            }
        }
        return perimeter;
    }

      
     public void DFS(int[][] grid, int sr, int sc){
       
         
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
        if(grid[sr][sc]==-1) return;   // visited
         
         grid[sr][sc] = -1;
               
         DFS(grid,sr+1,sc);
         DFS(grid,sr-1,sc);
         DFS(grid,sr,sc+1);
         DFS(grid,sr,sc-1);
            
    }
    
  
}