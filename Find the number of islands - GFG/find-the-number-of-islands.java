//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        int count=0;
        int n = grid.length, m = grid[0].length;
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(grid[i][j] == '1'){
					DFS(grid,i,j);
					count++;
				}
			}
		}
		return count;
    }
    
    public void DFS(char[][] grid, int r, int c){
		if(r<0 || r>=grid.length || c<0 || c>=grid[0].length)
			return;
		if(grid[r][c]=='0') return;
		grid[r][c] = '0';
		
		// vertical
		DFS(grid,r+1,c);
		DFS(grid,r-1,c);
		
		// horizontal
		DFS(grid,r,c+1);
		DFS(grid,r,c-1);
		
		// diagonal
		DFS(grid,r+1,c+1);
		DFS(grid,r-1,c-1);
		DFS(grid,r+1,c-1);
		DFS(grid,r-1,c+1);
		
		
	}
}