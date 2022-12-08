class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        
        boolean isRowZ = false;
        boolean isColZ = false;
    
    // checking zeroes
        // first row
        for(int i=0; i<r; i++){
            if(matrix[i][0]==0)
                isRowZ = true;
        }
        
        // first col
        for(int j=0; j<c; j++){
            if(matrix[0][j]==0)
                isColZ = true;
        }
        
        
        // excluding first row and first col        
        for(int i=1; i<r; i++){
            for(int j=1; j<c; j++){
                if(matrix[i][j]==0){
                   matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
   // setting zeroes
        // excluding first row and first col    
        for(int i=1; i<r; i++){
            for(int j=1; j<c; j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j] = 0;
                    
                }
            }
        }
        
        // first row
        for(int i=0; i<r; i++){
            if(isRowZ)                 
                matrix[i][0]=0;
        }
        
        // first col
        for(int j=0; j<c; j++){
            if(isColZ)                 
                matrix[0][j]=0;
        }
        
    }
}