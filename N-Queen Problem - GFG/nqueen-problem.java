//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.nQueen(n);
            if(ans.size() == 0)
                System.out.println("-1");
            else {
                for(int i = 0;i < ans.size();i++){
                    System.out.print("[");
                    for(int j = 0;j < ans.get(i).size();j++)
                        System.out.print(ans.get(i).get(j) + " ");
                    System.out.print("] ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean[][] board = new boolean[n][n];
        fillBoard(board,0,list);
        return mainList;
    }
    
    static void fillBoard(boolean[][] board,int r,ArrayList<Integer> list){
        
        int n = board.length;
        if(r == n){
            mainList.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int c=0; c<n; c++){
            if(!isValidBoard(board,r,c)) continue;
            
            board[r][c] = true;
            list.add(c+1);
            fillBoard(board,r+1,list);
            list.remove(list.size()-1);
            board[r][c] = false;
            
        }
    }
    
    public static boolean isValidBoard(boolean[][] board,int r,int c){
		for(int i=r-1; i>=0; i--){
			if(board[i][c]) return false;
		}
		for(int i=r-1,j=c-1; i>=0 && j>=0; i--,j--){
			if(board[i][j]) return false;
		}
		for(int i=r-1,j=c+1; i>=0 && j<board.length; i--,j++){
			if(board[i][j]) return false;
		}
		return true;
	}
}