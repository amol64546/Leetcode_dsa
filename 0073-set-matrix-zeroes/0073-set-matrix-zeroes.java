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
        
     // setting zeroes  
        
        for(int i=1; i<r; i++){
            for(int j=1; j<c; j++){
                if(matrix[i][j]==0){  // inner mat
                   matrix[i][0] = 0;  // set first col
                    matrix[0][j] = 0;  // set first row
                }
            }
        }
        
   
        
        for(int i=1; i<r; i++){
            for(int j=1; j<c; j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){  // first row and col
                    matrix[i][j] = 0;   // set inner mat
                    
                }
            }
        }
        
        // first row acc to starting iRowZ
        for(int i=0; i<r; i++){
            if(isRowZ)                 
                matrix[i][0]=0;
        }
        
        //  first col acc to starting isColZ
        for(int j=0; j<c; j++){
            if(isColZ)                 
                matrix[0][j]=0;
        }
        
    }
}