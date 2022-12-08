class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[] rowZ = new int[r];
        int[] colZ = new int[c];
        Arrays.fill(rowZ,1);
        Arrays.fill(colZ,1);
        
        
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(matrix[i][j]==0){
                   rowZ[i] = 0;
                   colZ[j] = 0;
                }
            }
        }
        
        System.out.println(Arrays.toString(rowZ));
         System.out.println(Arrays.toString(colZ));
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(rowZ[i]==0 || colZ[j]==0){
                    matrix[i][j] = 0;
                    
                }
            }
        }
    }
}