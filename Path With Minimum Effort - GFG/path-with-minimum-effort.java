//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int N = Integer.parseInt(S[0]);
            int M = Integer.parseInt(S[1]);
            int Grid[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String[] s = read.readLine().split(" ");
                for (int j = 0; j < M; j++) Grid[i][j] = Integer.parseInt(s[j]);
            }
            Solution ob = new Solution();
            System.out.println(ob.MinimumEffort(Grid));
        }
    }
}
// } Driver Code Ends


class Solution {
    
    int MinimumEffort(int heights[][]) {
        int m = heights.length, n = heights[0].length;
        int[] d = { 0,1,0,-1,0 };
        int[][] efforts = new int[m][n];
        for(int[] e: efforts){
            Arrays.fill(e,Integer.MAX_VALUE);
        }
        Queue<int[]> q = new LinkedList<>();
        efforts[0][0] = 0;
        q.add(new int[3]);
        
        while(!q.isEmpty()){
            int[] curr = q.remove();
            int currEffort = curr[0], x = curr[1], y = curr[2];
            
            for(int i=0; i<4; i++){
                int r = x + d[i];
                int c = y + d[i+1];
                 if(r<0 || c<0 || r>=m || c>=n) continue;
                int nextEffort = Math.max(currEffort, Math.abs(heights[r][c] - heights[x][y]));
                if(efforts[r][c] > nextEffort){
                    efforts[r][c] = nextEffort;
                    q.add(new int[]{nextEffort,r,c});
                }
            }
        }
        return efforts[m-1][n-1];
    }
}