class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];

        
        int value=1;
        int l=0, t=0, r=matrix[0].length-1, d=matrix.length-1;
        int k=0;
        while(l<=r && t<=d){
            if(k==0){
                for(int i=l; i<=r; i++){
                    matrix[t][i]=value++;
                }
                k=1; 
                t++;
            }
            if(k==1){
                for(int i=t; i<=d; i++){
                   matrix[i][r]=value++; 
                }
                k=2; 
                r--;
            }
            if(k==2){
                for(int i=r; i>=l; i--){
                    matrix[d][i]=value++;
                }
               k=3;  
                d--;
            }
            if(k==3){
                for(int i=d; i>=t; i--){
                    matrix[i][l]=value++;
                }
                k=0;
                l++;
            }
        }
        return matrix;
    }
}