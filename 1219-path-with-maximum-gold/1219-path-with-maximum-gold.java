class Solution {
    public int getMaximumGold(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        //boolean[][] vis = new boolean[n][m];
        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==0) continue;
                ans = Math.max(ans,dfs(grid,i,j));
            }
        }
        return ans;
    }
    
    int[] xdir = {1,0,-1,0};
    int[] ydir = {0,1,0,-1};
    
    public int dfs(int[][] grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0) return 0;
        
        //if(vis[i][j]) return 0;
        //vis[i][j] = true;
        int temp = grid[i][j];
         grid[i][j] = 0;
        int max=0;
        
        for(int d=0; d<4; d++){
            int x = xdir[d] + i;
            int y = ydir[d] + j;
            max = Math.max(max,dfs(grid,x,y)) ;
        } 
        grid[i][j] = temp;
        //vis[i][j] = false;
        return max + grid[i][j];
    }
}