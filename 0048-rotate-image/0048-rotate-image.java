class Solution {
    public void swapQuad(int[][] matrix, int i, int j,int n){
        
        int temp = matrix[i][j];
        matrix[i][j] = matrix[n-j-1][i];
        matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
        matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
         matrix[j][n-i-1] = temp;
        
        
    }
    
    
    public void rotate(int[][] matrix) {
        int n = matrix.length;
       
        for(int i=0; i<n; i++){
            for(int j=i; j<n-i-1; j++){
                swapQuad(matrix,i,j,n);
            }
        }
        
        
    }
}