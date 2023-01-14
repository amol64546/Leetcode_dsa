class Solution {
    int[] di = {0,1,0,-1};
    int[] dj = {1,0,-1,0};
    public int findPath(int[][] grid,int si,int sj,int validPlaces,boolean[][] vis){
        
        int m = grid.length, n = grid[0].length;
        if(si<0 || sj<0 || si>=m || sj>=n || vis[si][sj]) return 0;
        if(grid[si][sj] == -1) return 0;  
        if(grid[si][sj] == 2)  return (validPlaces==1) ? 1:0;
        
        vis[si][sj] = true;
        int count=0;
        for(int d=0; d<4; d++){
            int x = si+di[d];
            int y = sj+dj[d];
            count += findPath(grid,x,y,validPlaces-1,vis);
        }       
        
        vis[si][sj] = false;
        return count;
        
    }
    
    public int uniquePathsIII(int[][] grid) {
        int si=-1, sj=-1;
        int m = grid.length, n = grid[0].length;
        int validPlaces = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1) {
                    si=i; sj=j;
                }
                if(grid[i][j]!=-1) validPlaces++;
            }
        }
        boolean[][] vis = new boolean[m][n];
        return findPath(grid,si,sj,validPlaces,vis);
        
    }
}