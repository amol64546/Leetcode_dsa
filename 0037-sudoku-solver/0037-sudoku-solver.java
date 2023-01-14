class Solution {
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }
    
    public boolean solve(char[][] board,int i,int j){
        if(i == board.length) return true;
        
        if(j == board.length) return solve(board,i+1,0);
        
        if(board[i][j] != '.') return solve(board,i,j+1);
        
        for(char c='1'; c<='9'; c++){
            if(!isValid(board,i,j,c)) continue;
            board[i][j] = c;
            if(solve(board,i,j)) return true;
            board[i][j] = '.';
        }
        return false;
    }
    
    public boolean  isValid(char[][] board,int r,int c,char ch){
        for(int i=0; i<board.length; i++){
            if(board[i][c] == ch ||  board[r][i] == ch) return false;
        }
        for(int i=(r-r%3); i< 3+(r-r%3); i++){
            for(int j=(c-c%3); j< 3+(c-c%3); j++){
                if(board[i][j]==ch) return false;
            }
        }
        return true;
    }
}