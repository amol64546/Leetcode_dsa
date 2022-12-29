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
        HashSet<String> set = new HashSet<>();
        int count=0;
        int n = grid.length, m = grid[0].length;
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(explore(grid,i,j,set))
				    count++;
			}
		}
		return count;
    }
    
    public boolean explore(char[][] grid, int r, int c,HashSet<String> set){
        // out of bounds case
        boolean rowInbounds = 0<=r && r<grid.length;
        boolean colInbounds = 0<=c && c<grid[0].length;
		if(!rowInbounds || !colInbounds) return false;
		
		// water case
		if(grid[r][c]=='0') return false;
		
		String pos = ""+r+","+c;
		// visited case
		if(set.contains(pos)) return false;
		set.add(pos);
		
		// exploring
		int[][] directions = {{1,0},{-1,0},{0,1},{0,-1},{1,1},{-1,-1},{-1,1},{1,-1}};
		for(int[] dir: directions){
		    int x = dir[0];
		    int y = dir[1];
		    explore(grid,r+x,c+y,set);
		}
		
		return true;
		
		
	}
}