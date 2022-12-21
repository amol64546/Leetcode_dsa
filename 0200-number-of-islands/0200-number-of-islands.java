class Solution {
    
    public int numIslands(char[][] grid) {
        int sr = grid.length, sc = grid[0].length;
        int count=0;
        for(int i=0; i<sr; i++){
            for(int j=0; j<sc; j++){
                if(grid[i][j]=='1'){
                    DFS(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    
    
     public void DFS(char[][] image, int sr, int sc){
        if(sr<0 || sr>=image.length) return;            
        if(sc<0 || sc>=image[0].length) return;        
        if(image[sr][sc] == '0') return;
        
        image[sr][sc] = '0'; 
         
        DFS(image,sr+1,sc);
        DFS(image,sr-1,sc);
        DFS(image,sr,sc+1);
        DFS(image,sr,sc-1);      
    }
    
  
}