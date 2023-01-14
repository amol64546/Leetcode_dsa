class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        char[][] board = new char[n][n];
        for(char[] arr: board)
            Arrays.fill(arr,'.');        
        
        List<String> list = new ArrayList<>();
        backtrack(board,0,list);
        return mainList;
    }
    List<List<String>> mainList = new ArrayList<>();
     
    
    public void backtrack(char[][] board,int r, List<String> list){      
        
        if(r == board.length){
            mainList.add(constructBoard(board));
            return;
        }
        
        for(int c=0; c<board.length; c++){
            if(!canPlaceQueen(board,r,c))  continue;            
                board[r][c] = 'Q';               
                backtrack(board,r+1,list);               
                board[r][c] = '.';
        }
       
       
    }
    
    
    public List<String> constructBoard(char[][] board){
        List<String> list = new ArrayList<>();
        for(char[] arr: board)
            list.add(new String(arr));
        return list;
    }
    
    
    public static boolean canPlaceQueen(char[][] board,int r,int c){
        // column check
		for(int i=r-1; i>=0; i--){
			if(board[i][c]=='Q') return false;
		}
        // diagonal
		for(int i=r-1,j=c-1; i>=0 && j>=0; i--,j--){
			if(board[i][j]=='Q') return false;
		}
         // anti-diagonal
		for(int i=r-1,j=c+1; i>=0 && j<board.length; i--,j++){
			if(board[i][j]=='Q') return false;
		}
		return true;
	}
    
   
}