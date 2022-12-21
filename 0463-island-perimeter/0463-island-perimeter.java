class Solution {
    
    int perimeter=0;
    public int islandPerimeter(int[][] grid) {
         int sr = grid.length, sc = grid[0].length;
       
        for(int i=0; i<sr; i++){
            for(int j=0; j<sc; j++){
                if(grid[i][j]==0) continue;
                count(grid,i+1,j);
                count(grid,i-1,j);
                count(grid,i,j+1);
                count(grid,i,j-1);
            }
        }
        return perimeter;
    }

      
     public void count(int[][] grid, int sr, int sc){
         
        if(sr<0 || sr>=grid.length){
            perimeter += 1;
            return;
           
        }                     
        if(sc<0 || sc>=grid[0].length){
             perimeter += 1;
            return;
        }           
        if(grid[sr][sc] == 0)
            perimeter += 1;       
            
    }
    
  
}