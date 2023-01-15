class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
		
		return tabulation(grid,m,n);
    }
    
    public static int tabulation(int[][] a,int m,int n){
		for(int i=m-1; i>=0; i--){
			for(int j=n-1; j>=0; j--){				
				if(i==m-1 && j==n-1) continue;										
				int right = (j+1<n) ? a[i][j+1] : Integer.MAX_VALUE;		
				int down = (i+1<m) ? a[i+1][j] : Integer.MAX_VALUE ;			
				a[i][j] += Math.min(right,down);
			}
		}
		return a[0][0];
	}
}